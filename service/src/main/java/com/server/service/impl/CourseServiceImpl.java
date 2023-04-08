package com.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.CourseLevelMapper;
import com.server.mapper.CourseMapper;
import com.server.service.CourseService;
import entity.Course;
import entity.CourseLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
    @Autowired
    private CourseLevelMapper courseLevelMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public void saveCourse(Course course) {
        if(course.getId() == 0){
            courseMapper.insert(course);
        }
        else{
            courseMapper.updateById(course);
        }

        QueryWrapper<CourseLevel> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("level",course.getId());
        courseLevelMapper.delete(queryWrapper);

        course.getLevels().forEach(level -> {
            CourseLevel courseLevel = CourseLevel.builder()
                    .course(course.getId())
                    .level(level).build();
            courseLevelMapper.insert(courseLevel);
        });
    }
}
