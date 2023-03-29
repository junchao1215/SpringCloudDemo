package com.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import entity.Student;

public interface StudentService extends IService<Student> {
    Student getStudentById(Long id);
}
