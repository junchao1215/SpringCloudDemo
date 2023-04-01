package com.client.feign.Fallback;

import com.client.feign.TeacherFeignClientService;
import common.Result;
import entity.Teacher;
import org.springframework.stereotype.Component;

@Component
public class TeacherFeignServiceFallback implements TeacherFeignClientService {


    @Override
    public Result<Teacher> editTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public void getTeacherById(Teacher teacher) {

    }

    @Override
    public void findAllTeacher(Teacher teacher) {

    }




}
