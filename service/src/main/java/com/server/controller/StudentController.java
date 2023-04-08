package com.server.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.server.service.*;
import common.Result;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/crud")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private FinishWorkService finishHomeWorkService;
    @Autowired
    private HomeWorkService homeWorkService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private LevelService levelService;
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

    @PostMapping("/viewCourse/{id}")
    public List<Course> viewCourse(@PathVariable(name = "id") Long id) {
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq();
        courseService.list(queryWrapper);
    }

}
