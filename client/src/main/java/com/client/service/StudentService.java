package com.client.service;

import dto.StudentRequest;
import entity.*;

import java.util.List;

public interface StudentService {
    void edit(StudentRequest stu);
    Student getById(Student student);
    List<Student> findAll(Student student);

    void editHomeWork(FinishHomeWork work);
    void publishHomeWork(FinishHomeWork work);

    HomeWork acceptHomeWork(Long id);

    List<Level> viewLevel(Long id);

    List<Course> viewCourse(Long id);
}
