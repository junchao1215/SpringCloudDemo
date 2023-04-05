package com.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.Attach;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AttachMapper extends BaseMapper<Attach> {
    List<Attach> selectAttachByBusiId(@Param("busiId") Long busiId);
}
