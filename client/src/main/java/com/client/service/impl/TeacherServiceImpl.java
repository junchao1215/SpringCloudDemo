package com.client.service.impl;

import com.client.feign.TeacherFeignClientService;
import com.client.service.TeacherService;
import com.client.service.UserService;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherFeignClientService teacherFeignClientService;
    @Autowired
    private UserService userService;
    @Override
    public void edit(Teacher teacher) {
        User user =User.builder()
                .userName(teacher.getTeacherNo())
                .nickName(teacher.getTeacherNm())
                .build();
        userService.saveUser(user);
        teacherFeignClientService.editTeacher(teacher);
    }

    @Override
    public Teacher getById(Teacher teacher) {

        return teacherFeignClientService.getTeacherById(teacher.getId());
    }

    @Override
    public List<Teacher> findAll(Teacher teacher) {
        teacherFeignClientService.findAllTeacher(teacher);
        return null;
    }

    @Override
    public void editHomeWork(HomeWork work) {
        teacherFeignClientService.editHomeWork(work);
    }

    @Override
    public void publishHomeWork(HomeWork work) {
        teacherFeignClientService.editHomeWork(work);
    }

    @Override
    public FinishHomeWork checkHomeWork(Long id) {
        return teacherFeignClientService.checkFinishHomeWork(id);
    }

    @Override
    public void editLevel(Level level) {
        teacherFeignClientService.editLevel(level);
    }
}
