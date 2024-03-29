package com.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
    Teacher getTeacherById(@Param("id") Long id);
}
