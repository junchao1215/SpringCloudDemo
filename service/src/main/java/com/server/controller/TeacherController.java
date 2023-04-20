package com.server.controller;

import com.server.service.*;
import common.Result;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/teacher")
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
        homeWorkService.saveHomeWork(work);
    }

    @PostMapping("/checkFinishHomeWork/{id}")
    public FinishHomeWork checkFinishHomeWork(@PathVariable(name = "id") Long id) {
        return finishWorkService.getHomeWork(id);
    }
    @PostMapping(value = "/getTeacherObject/{id}")
    public Result<Teacher> getTeacherObject(@PathVariable(name = "id") Long id) {
        Teacher teacher = teacherService.getTeacherById(id);
        return Result.ok(teacher);
    }

    @PostMapping("/editLevel")
    public void editLevel(@RequestBody Level level) {
        levelService.saveLevel(level);
    }

    @PostMapping("/editCourse")
    public void editCourse(@RequestBody Course course) {
        courseService.saveCourse(course);
    }
}
