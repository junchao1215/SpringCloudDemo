package com.client.feign;

import common.Result;
import entity.Parent;
import entity.Student;
import entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-server",path = "/crud")
public interface CRUDFeignClientService {
    @GetMapping("/editTeacher")
    Result<Teacher> editTeacher(@RequestParam("teacher") Teacher teacher);
    @GetMapping("/getTeacherObject")
    void getTeacherById(@RequestParam("teacher") Teacher teacher);
    @GetMapping("/findAllTeacher")
    void findAllTeacher(@RequestParam("teacher") Teacher teacher);



    @GetMapping("/editStudent")
    Result<Student> editStudent(@RequestParam("student") Student student);
    @GetMapping("/getStudentObject")
    void getStudentById(@RequestParam("student") Student student);
    @GetMapping("/findAllStudent")
    void findAllStudent(@RequestParam("student") Student student);


    @GetMapping("/editParent")
    Result<Parent> editParent(@RequestParam("parent") Parent parent);
    @GetMapping("/getParentObject")
    void getParentById(@RequestParam("parent") Parent parent);
    @GetMapping("/findAllParent")
    void findAllParent(@RequestParam("parent") Parent parent);
}
