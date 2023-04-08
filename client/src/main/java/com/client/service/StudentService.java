package com.client.service;

import com.client.service.impl.CourseServiceImpl;
import entity.*;

import java.util.List;

public interface StudentService {
    void edit(Student stu);
    Student getById(Student student);
    List<Student> findAll(Student student);

    void editHomeWork(FinishHomeWork work);
    void publishHomeWork(FinishHomeWork work);

    HomeWork acceptHomeWork(Long id);

    List<Level> viewLevel(Long id);

    List<Course> viewCourse(Long id);
}
