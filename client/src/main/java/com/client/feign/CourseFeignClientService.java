package com.client.feign;

import entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "nacos-server",path = "/course",contextId = "course")
public interface CourseFeignClientService {
    @PostMapping("/editCourse")
    void editCourse(@RequestBody Course course);





}
