package com.client.feign.Fallback;

import com.client.feign.StudentFeignClientService;
import entity.Student;
import org.springframework.stereotype.Component;

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
    public void findAllStudent(Student student) {

    }


}
