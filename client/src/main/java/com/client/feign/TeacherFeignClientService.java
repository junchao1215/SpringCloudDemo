package com.client.feign;

import com.client.feign.Fallback.TeacherFeignServiceFallback;
import common.Result;
import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Level;
import entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "nacos-server",path = "/teacher",contextId = "teacher",fallback = TeacherFeignServiceFallback.class)
public interface TeacherFeignClientService {
    @PostMapping("/editTeacher")
    Result<Teacher> editTeacher(@RequestBody Teacher teacher);
    @GetMapping("/getTeacherObject/{id}")
    Teacher getTeacherById(@PathVariable("id") Long id);
    @GetMapping("/findAllTeacher")
    List<Teacher> findAllTeacher(@RequestParam("teacher") Teacher teacher);

    @PostMapping("/editHomeWork")
    void editHomeWork(@RequestBody HomeWork work);


    @PostMapping("/checkFinishHomeWork/{id}")
    FinishHomeWork checkFinishHomeWork(@PathVariable("id") Long id);

    @PostMapping("/editLevel")
    void editLevel(@RequestBody Level level);




    @PostMapping("/viewLevel/{id}")
    void viewLevel(@PathVariable("id") Long id);





}
