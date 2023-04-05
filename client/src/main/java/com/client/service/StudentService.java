package com.client.service;

import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Student;

import java.util.List;

public interface StudentService {
    void edit(Student stu);
    Student getById(Student student);
    List<Student> findAll(Student student);

    void editHomeWork(FinishHomeWork work);
    void publishHomeWork(FinishHomeWork work);

    HomeWork acceptHomeWork(Long id);
}
