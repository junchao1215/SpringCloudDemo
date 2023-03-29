package com.client.feign.Fallback;

import com.client.feign.CRUDFeignClientService;
import common.Result;
import entity.Parent;
import entity.Student;
import entity.Teacher;
import org.springframework.stereotype.Component;

@Component
public class CRUDFeignServiceFallback implements CRUDFeignClientService {


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

    @Override
    public Student editStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }


    @Override
    public void findAllStudent(Student student) {

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
}
