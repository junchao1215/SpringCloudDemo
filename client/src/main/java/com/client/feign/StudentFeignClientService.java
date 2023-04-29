package com.client.feign;

import com.client.feign.Fallback.StudentFeignServiceFallback;
import common.Result;
import dto.StudentRequest;
import entity.Course;
import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "nacos-server",path = "/student",contextId = "student",fallback = StudentFeignServiceFallback.class)
public interface StudentFeignClientService {


    @PostMapping("/editStudent")
    Result<Student> editStudent(@RequestBody StudentRequest student);
    @GetMapping("/getStudentById/{id}")
    Result<Student> getStudentById(@PathVariable("id") Long id);
    @GetMapping("/findAllStudent")
    Result<List<Student>> findAllStudent(@RequestParam("student") Student student);

    @PostMapping("/editFinishHomeWork")
    void editFinishHomeWork(@RequestBody FinishHomeWork work);
    @PostMapping("/acceptHomeWork/{id}")
    HomeWork acceptHomeWork(@PathVariable("id") Long id);
    @PostMapping("/viewCourse/{id}")
    List<Course> viewCourse(@PathVariable("id") Long id);
}
