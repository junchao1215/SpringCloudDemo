package com.client.service;

import com.client.auth.User;
import entity.Student;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface StudentService {
    void edit(Student stu);
    Student getById(Student student);
    List<Student> findAll(Student student);
}
