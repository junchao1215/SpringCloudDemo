package com.client.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.client.auth.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
