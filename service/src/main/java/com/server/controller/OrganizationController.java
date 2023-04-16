package com.server.controller;

import com.server.service.*;
import common.Result;
import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/crud")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;
    @PostMapping(value = "/editOrgan")
    public Result<Organ> insert(@RequestBody Organ organ) {
        organizationService.saveOrUpdate(organ);
         return Result.ok();
    }


}
