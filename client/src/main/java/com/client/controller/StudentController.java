package com.client.controller;

import com.client.log.OperatorLog;
import com.client.service.StudentService;
import common.Result;
import entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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





}
