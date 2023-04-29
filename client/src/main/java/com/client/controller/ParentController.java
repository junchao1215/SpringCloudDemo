package com.client.controller;

import com.client.log.OperatorLog;
import com.client.service.ParentService;
import common.Result;
import entity.Parent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/parentApi")
@Slf4j
public class ParentController {

    @Autowired
    private ParentService parentService;
    @PostMapping("/edit")
    @OperatorLog(operate="保存/家长信息", module="家长信息")
    public Result<Parent> edit(@RequestBody Parent parent){
        parentService.edit(parent);
        return Result.ok();
    }

}
