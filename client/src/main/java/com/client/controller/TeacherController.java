package com.client.controller;

import com.client.log.OperatorLog;
import com.client.service.TeacherService;
import common.Result;
import entity.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teacherApi")
@Slf4j
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping("/edit")
    @OperatorLog(operate="保存/修改学生信息", module="学生")
    public Result edit(@RequestBody Teacher teacher) {
        teacherService.edit(teacher);
        return Result.ok();
    }

    public Result getById() {
        return null;
    }

    public Result findAll() {
        return null;
    }

}
