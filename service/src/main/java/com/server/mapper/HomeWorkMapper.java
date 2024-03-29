package com.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.HomeWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HomeWorkMapper extends BaseMapper<HomeWork> {
    HomeWork selectHomeWorkById(@Param("id") Long id);
}
