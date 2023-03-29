package com.server.controller;

import com.server.service.StudentService;
import common.Result;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/crud")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping(value = "/editStudent")
    public Result<Student> insert(@RequestBody Student student) {
         studentService.saveOrUpdate(student);
         return Result.ok();
    }
    @GetMapping(value = "/getStudentById/{id}")
    public Student getStudentById(@PathVariable(name = "id") Long id) {
        Student student = studentService.getStudentById(id);
        return student;
    }



}
