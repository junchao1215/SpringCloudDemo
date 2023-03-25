package com.client.service.impl;

import com.client.feign.CRUDFeignClientService;
import com.client.service.TeacherService;
import entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    CRUDFeignClientService crudFeignClientService;
    @Override
    public void edit(Teacher teacher) {

        crudFeignClientService.editTeacher(teacher);
    }

    @Override
    public Teacher getById(Teacher teacher) {
        crudFeignClientService.getTeacherById(teacher);
        return null;
    }

    @Override
    public List<Teacher> findAll(Teacher teacher) {
        crudFeignClientService.findAllTeacher(teacher);
        return null;
    }
}
