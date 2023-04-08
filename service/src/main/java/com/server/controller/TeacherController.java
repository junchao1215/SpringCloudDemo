package com.server.controller;

import com.server.service.*;
import common.Result;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/crud")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private HomeWorkService homeWorkService;
    @Autowired
    private FinishWorkService finishWorkService;
    @Autowired
    private LevelService levelService;
    @Autowired
    private CourseService courseService;
    @PostMapping(value = "/editTeacher")
    public Result<Teacher> insert(@RequestBody Teacher teacher) {
         teacherService.saveOrUpdate(teacher);
         return Result.ok();
    }

    @PostMapping("/editHomeWork")
    public void editHomeWork(@RequestBody HomeWork work) {
        homeWorkService.saveOrUpdate(work);
    }

    @PostMapping("/checkFinishHomeWork/{id}")
    public FinishHomeWork checkFinishHomeWork(@PathVariable(name = "id") Long id) {
        return finishWorkService.getHomeWork(id);
    }
    @PostMapping(value = "/getTeacherObject/{id}")
    public Result<Teacher> getTeacherObject(@PathVariable(name = "id") Long id) {
        teacherService.getTeacherById(id);
        return Result.ok();
    }

    @PostMapping("/editLevel")
    public Result editLevel(@RequestBody Level level) {
        levelService.saveLevel(level);
        return Result.ok();
    }

    @PostMapping("/editCourse")
    public Result editCourse(@RequestBody Course course) {
        courseService.saveOrUpdate(course);
        return Result.ok();
    }
}
