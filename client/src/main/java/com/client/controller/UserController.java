package com.client.controller;

import com.client.auth.LoginResult;
import com.client.auth.Result;
import com.client.auth.SysUser;
import com.client.common.JsonResult;
import com.client.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public LoginResult login(@RequestBody SysUser user){
        return loginService.login(user);
    }

}
