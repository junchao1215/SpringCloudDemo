package com.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import dto.StudentRequest;
import entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper extends BaseMapper<StudentRequest> {
    Student getStudentById(@Param("id") Long id);
}
