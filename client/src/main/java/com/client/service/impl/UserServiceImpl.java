package com.client.service.impl;

import entity.User;
import com.client.mapper.UserMapper;
import com.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void saveUser(User user) {
        String pwd = new BCryptPasswordEncoder().encode("123456");
        user.setPassword(pwd);
        userMapper.insert(user);
    }
}
