package com.client.service.impl;

import com.client.feign.CRUDFeignClientService;
import com.client.service.CourseService;
import entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CRUDFeignClientService crudFeignClientService;

    @Override
    public void edit(Course course) {
        crudFeignClientService.editCourse(course);
    }

}
