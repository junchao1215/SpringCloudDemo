package com.client.service;

import com.client.auth.User;
import common.Result;
import entity.Student;
import entity.Teacher;

import java.util.List;

public interface TeacherService {
    void edit(Teacher teacher);
    Teacher getById(Teacher teacher);
    List<Teacher> findAll(Teacher teacher);
}
