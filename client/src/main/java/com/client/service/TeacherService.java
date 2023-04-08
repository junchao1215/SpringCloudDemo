package com.client.service;

import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Level;
import entity.Teacher;

import java.util.List;

public interface TeacherService {
    void edit(Teacher teacher);
    Teacher getById(Teacher teacher);
    List<Teacher> findAll(Teacher teacher);

    void editHomeWork(HomeWork work);
    void publishHomeWork(HomeWork work);
    FinishHomeWork checkHomeWork(Long id);

    void editLevel(Level level);


}
