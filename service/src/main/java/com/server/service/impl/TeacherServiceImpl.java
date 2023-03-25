package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.TeacherMapper;
import com.server.service.TeacherService;
import entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

}
