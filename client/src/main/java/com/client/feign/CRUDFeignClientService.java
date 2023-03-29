package com.client.feign;

import common.Result;
import entity.Parent;
import entity.Student;
import entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "nacos-server",path = "/crud")
public interface CRUDFeignClientService {
    @PostMapping("/editTeacher")
    Result<Teacher> editTeacher(@RequestBody Teacher teacher);
    @GetMapping("/getTeacherObject")
    void getTeacherById(@RequestParam("teacher") Teacher teacher);
    @GetMapping("/findAllTeacher")
    void findAllTeacher(@RequestParam("teacher") Teacher teacher);



    @PostMapping("/editStudent")
    Student editStudent(@RequestBody Student student);
    @GetMapping("/getStudentById/{id}")
    Student getStudentById(@PathVariable("id") Long id);
    @GetMapping("/findAllStudent")
    void findAllStudent(@RequestParam("student") Student student);


    @PostMapping("/editParent")
    Result<Parent> editParent(@RequestBody Parent parent);
    @GetMapping("/getParentObject")
    void getParentById(@RequestParam("parent") Parent parent);
    @GetMapping("/findAllParent")
    void findAllParent(@RequestParam("parent") Parent parent);
}
