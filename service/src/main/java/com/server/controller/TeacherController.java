package com.server.controller;

import com.server.service.TeacherService;
import common.Result;
import entity.Student;
import entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/crud")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping(value = "/editTeacher")
    public Result<Student> insert(Teacher teacher) {
         teacherService.saveOrUpdate(teacher);
         return Result.ok();
    }



}
