package com.client.feign;

import common.Result;
import entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "nacos-server",path = "/crud")
public interface CRUDFeignClientService {
    @PostMapping("/editTeacher")
    void editTeacher(@RequestBody Teacher teacher);
    @GetMapping("/getTeacherObject")
    Teacher getTeacherById(@RequestParam("teacher") Teacher teacher);
    @GetMapping("/findAllTeacher")
    List<Teacher> findAllTeacher(@RequestParam("teacher") Teacher teacher);



    @PostMapping("/editStudent")
    Student editStudent(@RequestBody Student student);
    @GetMapping("/getStudentById/{id}")
    Student getStudentById(@PathVariable("id") Long id);
    @GetMapping("/findAllStudent")
    List<Student> findAllStudent(@RequestParam("student") Student student);


    @PostMapping("/editParent")
    Result<Parent> editParent(@RequestBody Parent parent);
    @GetMapping("/getParentObject")
    void getParentById(@RequestParam("parent") Parent parent);
    @GetMapping("/findAllParent")
    void findAllParent(@RequestParam("parent") Parent parent);



    @PostMapping("/editHomeWork")
    void editHomeWork(@RequestBody HomeWork work);
    @PostMapping("/editFinishHomeWork")
    void editFinishHomeWork(@RequestBody FinishHomeWork work);

    @PostMapping("/checkFinishHomeWork/{id}")
    FinishHomeWork checkFinishHomeWork(@PathVariable("id") Long id);

    @PostMapping("/acceptHomeWork/{id}")
    HomeWork acceptHomeWork(@PathVariable("id") Long id);
}
