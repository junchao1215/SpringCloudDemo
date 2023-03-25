package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.StudentMapper;
import com.server.service.StudentService;
import entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
