package com.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import dto.StudentRequest;
import entity.Student;

public interface StudentService extends IService<StudentRequest> {
    Student getStudentById(Long id);
    void saveStudent(StudentRequest student);
}
