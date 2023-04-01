package com.client.service;

import entity.Student;

import java.util.List;

public interface StudentService {
    void edit(Student stu);
    Student getById(Student student);
    List<Student> findAll(Student student);
}
