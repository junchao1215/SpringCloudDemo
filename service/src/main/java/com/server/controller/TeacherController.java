package com.server.controller;

import com.server.service.HomeWorkService;
import com.server.service.TeacherService;
import common.Result;
import entity.HomeWork;
import entity.Student;
import entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/crud")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private HomeWorkService homeWorkService;
    @PostMapping(value = "/editTeacher")
    public Result<Teacher> insert(@RequestBody Teacher teacher) {
         teacherService.saveOrUpdate(teacher);
         return Result.ok();
    }

    @PostMapping("/editHomeWork")
    public void editHomeWork(@RequestBody HomeWork work) {
        homeWorkService.saveOrUpdate(work);
    }

}
