package com.client.controller;

import com.client.log.OperatorLog;
import com.client.service.CourseService;
import com.client.service.TeacherService;
import common.Result;
import entity.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/teacherApi")
@Slf4j
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private CourseService courseService;
    @PostMapping("/edit")
    @OperatorLog(operate="保存/修改教师信息", module="教师")
    public Result<Teacher> edit(@RequestBody Teacher teacher) {
        return teacherService.edit(teacher);
    }
    @PostMapping("/editHomeWork")
    @OperatorLog(operate="保存/修改作业", module="教师")
    public Result editHomeWork(@RequestBody HomeWork work) {
        teacherService.editHomeWork(work);
        return Result.ok();
    }
    @PostMapping("/publishHomeWork")
    @OperatorLog(operate="发布作业", module="教师")
    public Result publishHomeWork(@RequestBody HomeWork work) {
        work.setStatus(1);
        teacherService.publishHomeWork(work);
        return Result.ok();
    }

    @PostMapping("/checkHomeWork/{id}")
    @OperatorLog(operate="检查作业", module="教师")
    public Result checkHomeWork(@PathVariable("id") Long id) {
        FinishHomeWork work = teacherService.checkHomeWork(id);
        return Result.ok(work);
    }
    @PostMapping("/getById/{id}")
    @OperatorLog(operate="获取教师信息", module="教师")
    public Result getById(@PathVariable("id") Long id) {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher = teacherService.getById(teacher);
        return Result.ok(teacher);
    }

    @PostMapping("/editLevel")
    @OperatorLog(operate="保存/修改班", module="教师")
    public Result editLevel(@RequestBody Level level) {
        teacherService.editLevel(level);
        return Result.ok();
    }

    @PostMapping("/publishCourse")
    @OperatorLog(operate="发布课程", module="教师")
    public Result publishCourse(@RequestBody Course course) {
        courseService.edit(course);
        return Result.ok();
    }
    public Result findAll() {
        return null;
    }

}
