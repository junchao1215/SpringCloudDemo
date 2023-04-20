package com.server.controller;

import com.server.service.ParentService;
import common.Result;
import entity.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/parent")
public class ParentController {
    @Autowired
    private ParentService parentService;
    @PostMapping(value = "/editParent")
    public Result<Parent> insert(@RequestBody Parent parent) {
        parentService.saveOrUpdate(parent);
        return Result.ok();
    }



}
