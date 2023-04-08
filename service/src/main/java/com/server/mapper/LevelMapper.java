package com.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Level;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LevelMapper extends BaseMapper<Level> {
    List<Level> getLevelByTeacherNo(@Param("teacherno") String teacherno);
}
