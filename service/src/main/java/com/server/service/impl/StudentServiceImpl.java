package com.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.StudentLevelMapper;
import com.server.mapper.StudentMapper;
import com.server.service.StudentService;
import entity.Student;
import entity.StudentLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentLevelMapper studentLevelMapper;
    public Student getStudentById(Long id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        if(student.getId() == null){
            studentMapper.insert(student);
        }
        else{
            studentMapper.updateById(student);
        }

        QueryWrapper<StudentLevel> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student",student.getStudentNo());
        studentLevelMapper.delete(queryWrapper);
        if(student.getLevels()!=null && !student.getLevels().isEmpty()){
            student.getLevels().forEach(level -> {
                StudentLevel studentLevel = StudentLevel.builder()
                        .student(student.getStudentNo())
                        .level(level.getId()).build();
                studentLevelMapper.insert(studentLevel);
            });
        }

    }
}
