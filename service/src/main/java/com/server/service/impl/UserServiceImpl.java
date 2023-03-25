package com.server.service.impl;

import com.server.entity.User;
import com.server.mapper.UserMapper;
import com.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public void insert() {
        User user = new User();
        userMapper.insert(user);
    }

    public void update() {
        User user = new User();

        userMapper.updateById(user);
    }
}
