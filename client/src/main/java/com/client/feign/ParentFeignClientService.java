package com.client.feign;

import common.Result;
import entity.Parent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-server",path = "/parent",contextId = "parent")
public interface ParentFeignClientService {



    @PostMapping("/editParent")
    Result<Parent> editParent(@RequestBody Parent parent);
    @GetMapping("/getParentObject")
    void getParentById(@RequestParam("parent") Parent parent);
    @GetMapping("/findAllParent")
    void findAllParent(@RequestParam("parent") Parent parent);
}
