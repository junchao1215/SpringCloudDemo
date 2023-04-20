package com.client.controller;

import com.client.log.OperatorLog;
import com.client.service.StudentService;
import common.Result;
import common.ResultCode;
import entity.*;
import global.ExceptionDefine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/studentApi")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/edit")
    @OperatorLog(operate="保存/修改学生信息", module="学生")
    public Result<Student> edit(@RequestBody Student student){

            studentService.edit(student);
            return Result.ok();


    }


    @GetMapping("/getById/{id}")
    @OperatorLog(operate="根据ID获取学生信息", module="学生")
    public Result<Student> getById(@PathVariable Long id){
        Student student = new Student();
        student.setId(id);
        student =  studentService.getById(student);
        return Result.ok(student);
    }

    @PostMapping("/editHomeWork")
    @OperatorLog(operate="保存/修改作业", module="学生")
    public Result editHomeWork(@RequestBody FinishHomeWork work) {
        studentService.editHomeWork(work);
        return Result.ok();
    }
    @PostMapping("/publishHomeWork")
    @OperatorLog(operate="提交作业", module="学生")
    public Result publishHomeWork(@RequestBody FinishHomeWork work) {
        work.setStatus(1);
        studentService.publishHomeWork(work);
        return Result.ok();
    }

    @PostMapping("/acceptHomeWork/{id}")
    @OperatorLog(operate="接收作业", module="学生")
    public Result checkHomeWork(@PathVariable("id") Long id) {
        HomeWork work = studentService.acceptHomeWork(id);
        return Result.ok(work);
    }

    @PostMapping("/viewCourse/{id}")
    @OperatorLog(operate="接收课程", module="学生")
    public Result viewCourse(@PathVariable("id") Long id) {
        List<Course> list = studentService.viewCourse(id);
        return Result.ok(list);
    }

}
