package com.server.controller;

import com.server.service.FinishWorkService;
import com.server.service.HomeWorkService;
import com.server.service.StudentService;
import common.Result;
import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/crud")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private FinishWorkService finishHomeWorkService;
    @Autowired
    private HomeWorkService homeWorkService;
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

    @PostMapping("/editFinishHomeWork")
    public void editFinishHomeWork(@RequestBody FinishHomeWork work) {
        finishHomeWorkService.saveFinishHomeWork(work);
    }
    @PostMapping("/acceptHomeWork/{id}")
    public HomeWork acceptHomeWork(@PathVariable(name = "id") Long id) {
        return homeWorkService.getHomeWork(id);
    }
}
