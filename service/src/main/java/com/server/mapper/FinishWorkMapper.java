package com.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.FinishHomeWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FinishWorkMapper extends BaseMapper<FinishHomeWork> {
    FinishHomeWork getFinishHomeWorkById(@Param("id") Long id);
}
