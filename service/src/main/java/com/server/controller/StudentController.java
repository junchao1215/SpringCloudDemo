package com.server.controller;

import com.server.service.StudentService;
import common.Result;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/curd")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping(value = "/editStudent")
    public Result<Student> insert(Student student) {
         studentService.saveOrUpdate(student);
         return Result.ok();
    }



}
