package com.client.service.impl;

import com.client.auth.*;
import com.client.service.LoginService;
import common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.client.auth.JwtUtil;

import java.util.HashMap;
import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;
    @Autowired
    private RedisCache redisCache;
    @Override
    public Result<LoginUser> login(User user) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        if(Objects.isNull(authenticate)){
            throw new RuntimeException("用户名或密码错误");
        }
        //使用userid生成token
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        String userId = loginUser.getUser().getId().toString();
        String jwt = jwtUtil.createJWT(userId);
        //authenticate存入redis
        redisCache.setCacheObject("login:"+userId,loginUser);
        //把token响应给前端
        loginUser.setToken(jwt);
        return Result.ok(loginUser);


    }
    @Override
    public Result<LoginUser> logout() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        Long userid = loginUser.getUser().getId();
        redisCache.deleteObject("login:"+userid);
        return Result.ok();
    }

}
