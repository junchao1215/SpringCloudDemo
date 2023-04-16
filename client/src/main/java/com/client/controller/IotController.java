package com.client.controller;

import com.client.log.OperatorLog;
import com.client.service.Dh11Service;
import common.Result;
import entity.Dh11;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/iotApi")
@Slf4j
public class IotController {

    @Autowired
    private Dh11Service dh11Service;
    @PostMapping("/publish")
    @OperatorLog(operate="发布", module="dh11")
    public Result<Dh11> publish(@RequestBody Dh11 dh11){
        dh11Service.publish(dh11);
         return Result.ok();
    }



}
