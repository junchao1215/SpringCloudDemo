package com.client.feign.Fallback;

import com.client.feign.TeacherFeignClientService;
import common.Result;
import common.ResultCode;
import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Level;
import entity.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeacherFeignServiceFallback implements TeacherFeignClientService {


    @Override
    public Result<Teacher> editTeacher(Teacher teacher) {

        return Result.fail(ResultCode.FEIGN_ERROR);
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return null;
    }

    @Override
    public List<Teacher> findAllTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public void editHomeWork(HomeWork work) {

    }

    @Override
    public FinishHomeWork checkFinishHomeWork(Long id) {
        return null;
    }

    @Override
    public void editLevel(Level level) {
        System.out.println("--------");

    }



    @Override
    public void viewLevel(Long id) {

    }
}
