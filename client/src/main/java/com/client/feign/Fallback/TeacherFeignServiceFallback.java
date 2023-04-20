package com.client.feign.Fallback;

import com.client.feign.TeacherFeignClientService;
import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Level;
import entity.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeacherFeignServiceFallback implements TeacherFeignClientService {


    @Override
    public void editTeacher(Teacher teacher) {

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

    }



    @Override
    public void viewLevel(Long id) {

    }
}
