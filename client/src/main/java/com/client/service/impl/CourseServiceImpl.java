package com.client.service.impl;

import com.client.feign.CourseFeignClientService;
import com.client.service.CourseService;
import entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseFeignClientService courseFeignClientService;

    @Override
    public void edit(Course course) {
        courseFeignClientService.editCourse(course);
    }

}
