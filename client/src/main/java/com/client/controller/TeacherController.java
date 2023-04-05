package com.client.controller;

import com.client.log.OperatorLog;
import com.client.service.TeacherService;
import common.Result;
import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/teacherApi")
@Slf4j
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping("/edit")
    @OperatorLog(operate="保存/修改教师信息", module="教师")
    public Result edit(@RequestBody Teacher teacher) {
        teacherService.edit(teacher);
        return Result.ok();
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
    public Result getById() {
        return null;
    }

    public Result findAll() {
        return null;
    }

}
