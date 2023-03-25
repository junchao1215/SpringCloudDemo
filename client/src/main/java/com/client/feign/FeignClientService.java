package com.client.feign;

import com.client.auth.FeignInterceptorConfig;
import com.client.feign.Fallback.FeignServiceFallback;
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
