package com.client.feign.Fallback;

import com.client.feign.CourseFeignClientService;
import entity.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseFeignServiceFallback implements CourseFeignClientService {

    @Override
    public void editCourse(Course course) {

    }
}
