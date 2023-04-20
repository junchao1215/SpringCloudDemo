package com.client.feign.Fallback;

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
