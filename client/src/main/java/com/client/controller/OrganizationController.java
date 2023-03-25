package com.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
public class OrganizationController {
    @GetMapping("/list")
    public String findAll() {
        return "查询产品列表成功！";
    }

}
