package com.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    Student getStudentById(@Param("id") Long id);
}
