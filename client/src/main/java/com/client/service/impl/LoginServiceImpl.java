package com.client.service.impl;

import com.client.auth.*;
import com.client.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtils jwtUtils;
    @Override
    public LoginResult login(SysUser user) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
//        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
//        if(Objects.isNull(authenticate)){
//            throw new RuntimeException("用户名或密码错误");
//        }
        //使用userid生成token
//        SysUser loginUser = (SysUser) authenticate.getPrincipal();
        jwtUtils.setExpiration(1000l);
        jwtUtils.setSecret("uuuu");
        String jwt = jwtUtils.generateToken(user);

        //把token响应给前端
        HashMap<String,String> map = new HashMap<>();

        LoginResult loginResult = new LoginResult(user.getId(), ResultCode.SUCCESS,jwt,1l);
        return loginResult;


    }
}
