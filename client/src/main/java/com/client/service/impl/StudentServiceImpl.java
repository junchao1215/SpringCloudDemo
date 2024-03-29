package com.client.service.impl;

import common.Result;
import dto.StudentRequest;
import com.client.feign.StudentFeignClientService;
import com.client.service.StudentService;
import com.client.service.UserService;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
//    @Autowired
//    StudentFeignClientService studentFeignClientService;

    @Autowired
    private UserService userService;
    @Transactional
    @Override
    public void edit(StudentRequest stu) {
            if(stu.getId()==null){
                User user =User.builder()
                        .userName(stu.getStudentNo())
                        .nickName(stu.getStudentNm())
                        .build();
                userService.saveUser(user);
            }

//            studentFeignClientService.editStudent(stu);


    }

    @Override
    public Student getById(Student student) {
//        Result<Student> result= studentFeignClientService.getStudentById(student.getId());
//        return result.getData();
        return null;
    }

    @Override
    public List<Student> findAll(Student student) {
//        studentFeignClientService.findAllStudent(student);
        return null;
    }

    @Override
    public void editHomeWork(FinishHomeWork work) {
//        studentFeignClientService.editFinishHomeWork(work);
    }

    @Override
    public void publishHomeWork(FinishHomeWork work) {
//        studentFeignClientService.editFinishHomeWork(work);
    }

    @Override
    public HomeWork acceptHomeWork(Long id) {
//        return studentFeignClientService.acceptHomeWork(id);
        return null;
    }

    @Override
    public List<Level> viewLevel(Long id) {
        return null;
    }

    @Override
    public List<Course> viewCourse(Long id) {
//        return studentFeignClientService.viewCourse(id);
        return null;
    }
}
