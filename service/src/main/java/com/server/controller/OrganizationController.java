package com.server.controller;

import com.server.service.OrganizationService;
import common.Result;
import dto.OrganRequest;
import entity.Organ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/organ")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;
    @PostMapping(value = "/editOrgan")
    public Result<OrganRequest> insert(@RequestBody Organ organ) {

        organizationService.saveOrganization(organ);
         return Result.ok();
    }


}
