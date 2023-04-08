package com.client.service.impl;

import com.client.feign.CRUDFeignClientService;
import com.client.service.TeacherService;
import com.client.service.UserService;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    CRUDFeignClientService crudFeignClientService;
    @Autowired
    private UserService userService;
    @Override
    public void edit(Teacher teacher) {
        User user =User.builder()
                .userName(teacher.getTeacherNo())
                .nickName(teacher.getTeacherNm())
                .build();
        userService.saveUser(user);
        crudFeignClientService.editTeacher(teacher);
    }

    @Override
    public Teacher getById(Teacher teacher) {

        return crudFeignClientService.getTeacherById(teacher.getId());
    }

    @Override
    public List<Teacher> findAll(Teacher teacher) {
        crudFeignClientService.findAllTeacher(teacher);
        return null;
    }

    @Override
    public void editHomeWork(HomeWork work) {
        crudFeignClientService.editHomeWork(work);
    }

    @Override
    public void publishHomeWork(HomeWork work) {
        crudFeignClientService.editHomeWork(work);
    }

    @Override
    public FinishHomeWork checkHomeWork(Long id) {
        return crudFeignClientService.checkFinishHomeWork(id);
    }

    @Override
    public void editLevel(Level level) {
         crudFeignClientService.editLevel(level);
    }
}
