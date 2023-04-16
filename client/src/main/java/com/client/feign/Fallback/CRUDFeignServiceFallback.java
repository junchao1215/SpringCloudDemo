package com.client.feign.Fallback;

import com.client.feign.CRUDFeignClientService;
import common.Result;
import entity.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CRUDFeignServiceFallback implements CRUDFeignClientService {

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
    public Student editStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAllStudent(Student student) {
        return null;
    }

    @Override
    public Result<Parent> editParent(Parent parent) {
        return null;
    }

    @Override
    public void getParentById(Parent parent) {

    }

    @Override
    public void findAllParent(Parent parent) {

    }

    @Override
    public void editHomeWork(HomeWork work) {

    }

    @Override
    public void editFinishHomeWork(FinishHomeWork work) {

    }

    @Override
    public FinishHomeWork checkFinishHomeWork(Long id) {
        return null;
    }

    @Override
    public HomeWork acceptHomeWork(Long id) {
        return null;
    }

    @Override
    public void editLevel(Level level) {

    }

    @Override
    public void editCourse(Course course) {

    }

    @Override
    public void viewLevel(Long id) {

    }

    @Override
    public List<Course> viewCourse(Long id) {
        return null;
    }

    @Override
    public void editOrgan(Organ organ) {

    }


}
