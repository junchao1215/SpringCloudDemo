package com.server.controller;

import com.server.service.ParentService;
import common.Result;
import entity.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/crud")
public class ParentController {
    @Autowired
    private ParentService parentService;
    @GetMapping(value = "/editParent")
    public Result<Parent> insert(Parent parent) {
        parentService.saveOrUpdate(parent);
        return Result.ok();
    }



}
