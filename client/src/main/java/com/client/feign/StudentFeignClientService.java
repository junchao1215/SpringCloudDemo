package com.client.feign;

import entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "nacos-server",path = "/student",contextId = "student")
public interface StudentFeignClientService {


    @PostMapping("/editStudent")
    Student editStudent(@RequestBody Student student);
    @GetMapping("/getStudentById/{id}")
    Student getStudentById(@PathVariable("id") Long id);
    @GetMapping("/findAllStudent")
    void findAllStudent(@RequestParam("student") Student student);



}
