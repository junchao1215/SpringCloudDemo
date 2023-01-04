package com.client.controller;

import com.client.auth.ResponseResult;
import com.client.auth.User;
import com.client.feign.FeignClientService;
import com.client.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        return loginService.login(user);
    }


    @Autowired
    FeignClientService feignClientService;
    @GetMapping("/hello")
    public String hello(){
        return feignClientService.hello();
    }


}
