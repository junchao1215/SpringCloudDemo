package com.client.feign;

import entity.Organ;
import entity.Parent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "nacos-server",path = "/organ",contextId = "organ")
public interface OrganFeignClientService {



    @PostMapping("/editOrgan")
    void editOrgan(@RequestBody Organ organ);
}
