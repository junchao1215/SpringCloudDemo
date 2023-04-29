package com.client.feign.Fallback;

import common.Result;
import common.ResultCode;
import dto.StudentRequest;
import com.client.feign.StudentFeignClientService;
import entity.Course;
import entity.FinishHomeWork;
import entity.HomeWork;
import entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentFeignServiceFallback implements StudentFeignClientService {


    @Override
    public Result<Student> editStudent(StudentRequest student) {
        return Result.fail(ResultCode.FEIGN_ERROR);
    }

    @Override
    public Result<Student> getStudentById(Long id) {
        return null;
    }

    @Override
    public Result<List<Student>> findAllStudent(Student student) {
        return null;
    }

    @Override
    public void editFinishHomeWork(FinishHomeWork work) {

    }

    @Override
    public HomeWork acceptHomeWork(Long id) {
        return null;
    }

    @Override
    public List<Course> viewCourse(Long id) {
        return null;
    }
}
