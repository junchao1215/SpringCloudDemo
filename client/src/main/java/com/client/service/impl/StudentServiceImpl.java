package com.client.service.impl;

import com.client.feign.CRUDFeignClientService;
import com.client.service.StudentService;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    CRUDFeignClientService crudFeignClientService;
    @Override
    public void edit(Student stu) {
        crudFeignClientService.editStudent(stu);
    }

    @Override
    public Student getById(Student student) {
        crudFeignClientService.getStudentById(student);
        return null;
    }

    @Override
    public List<Student> findAll(Student student) {
        crudFeignClientService.findAllStudent(student);
        return null;
    }
}
