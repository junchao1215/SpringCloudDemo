package com.client.service.impl;

import com.client.feign.CRUDFeignClientService;
import com.client.service.StudentService;
import com.client.service.UserService;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    CRUDFeignClientService crudFeignClientService;
    @Autowired
    private UserService userService;
    @Override
    public void edit(Student stu) {
        User user =User.builder()
                .userName(stu.getStudentNo())
                .nickName(stu.getStudentNm())
                .build();
        userService.saveUser(user);
        crudFeignClientService.editStudent(stu);
    }

    @Override
    public Student getById(Student student) {

        return crudFeignClientService.getStudentById(student.getId());
    }

    @Override
    public List<Student> findAll(Student student) {
        crudFeignClientService.findAllStudent(student);
        return null;
    }

    @Override
    public void editHomeWork(FinishHomeWork work) {
        crudFeignClientService.editFinishHomeWork(work);
    }

    @Override
    public void publishHomeWork(FinishHomeWork work) {
        crudFeignClientService.editFinishHomeWork(work);
    }

    @Override
    public HomeWork acceptHomeWork(Long id) {
        return crudFeignClientService.acceptHomeWork(id);
    }

    @Override
    public List<Level> viewLevel(Long id) {
        return null;
    }

    @Override
    public List<Course> viewCourse(Long id) {
        return null;
    }
}
