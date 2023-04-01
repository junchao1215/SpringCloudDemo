package com.client.feign;

import common.Result;
import entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-server",path = "/teacher",contextId = "teacher")
public interface TeacherFeignClientService {
    @PostMapping("/editTeacher")
    Result<Teacher> editTeacher(@RequestBody Teacher teacher);
    @GetMapping("/getTeacherObject")
    void getTeacherById(@RequestParam("teacher") Teacher teacher);
    @GetMapping("/findAllTeacher")
    void findAllTeacher(@RequestParam("teacher") Teacher teacher);







}
