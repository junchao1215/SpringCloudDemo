package com.client.controller;

import com.client.log.OperatorLog;
import com.client.service.OrganizationService;
import common.Result;
import entity.Organ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organApi")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;
    @PostMapping("/edit")
    @OperatorLog(operate="保存/修改学校信息", module="学校")
    public Result<Organ> edit(@RequestBody Organ organ){
        organizationService.edit(organ);
        return Result.ok();
    }

}
