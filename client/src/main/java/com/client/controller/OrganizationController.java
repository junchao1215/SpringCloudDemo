package com.client.controller;

import base.Request;
import com.client.log.OperatorLog;
import com.client.service.OrganizationService;
import common.Result;
import dto.OrganRequest;
import entity.Organ;
import mapstruct.OrganizationStructMapper;
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
    @PostMapping(value="/edit")
    @OperatorLog(operate="保存/修改学校信息", module="学校")
    public Result<OrganRequest> edit(@RequestBody Request<OrganRequest> organRequest){
        Organ organ = OrganizationStructMapper.MAPSTRUCT.ToOrgan(organRequest.getBody());
        organizationService.edit(organ);
        return Result.ok();
    }

}
