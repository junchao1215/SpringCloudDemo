package com.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-server-provider",path = "/provider")
public interface FeignClientService {
    @GetMapping("/hello")
    String hello();
    @GetMapping("/insert")
    void insert();
    @GetMapping("/update")
    void update();
}
