package com.client.feign;

import dto.StudentRequest;
import entity.Course;
import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "nacos-server",path = "/student",contextId = "student")
public interface StudentFeignClientService {


    @PostMapping("/editStudent")
    Student editStudent(@RequestBody StudentRequest student);
    @GetMapping("/getStudentById/{id}")
    Student getStudentById(@PathVariable("id") Long id);
    @GetMapping("/findAllStudent")
    List<Student> findAllStudent(@RequestParam("student") Student student);

    @PostMapping("/editFinishHomeWork")
    void editFinishHomeWork(@RequestBody FinishHomeWork work);
    @PostMapping("/acceptHomeWork/{id}")
    HomeWork acceptHomeWork(@PathVariable("id") Long id);
    @PostMapping("/viewCourse/{id}")
    List<Course> viewCourse(@PathVariable("id") Long id);
}
