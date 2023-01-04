package com.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/provider")
public class ProviderController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello Nacos Discovery " ;
    }

}
