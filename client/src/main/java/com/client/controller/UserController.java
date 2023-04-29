package com.client.controller;

import com.client.auth.LoginUser;
import entity.User;
import com.client.log.OperatorLog;
import com.client.service.LoginService;
import common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/userApi")
@Slf4j
public class UserController {

    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    @OperatorLog(operate="用户登陆", module="用户管理")
    public Result<LoginUser> login(@RequestBody User user){
        return loginService.login(user);
    }


    @PostMapping("/wxlogin")
    @OperatorLog(operate="微信用户登陆", module="用户管理")
    public Result wxlogin(@RequestBody User user){
        return loginService.login(user);
    }


}
