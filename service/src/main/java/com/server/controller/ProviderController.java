package com.server.controller;

import com.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/provider")
public class ProviderController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/hello")
    public String hello() throws Exception {
        throw new Exception("");
    }
    @GetMapping(value = "/insert")
    public void insert() {
        userService.insert();

    }
    @GetMapping(value = "/update")
    public void update() {
       userService.update();
    }


}
