package com.client.feign;

import com.client.auth.FeignInterceptorConfig;
import com.client.feign.Fallback.FeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-server-provider",path = "/provider",fallback = FeignServiceFallback.class,configuration = FeignInterceptorConfig.class)
public interface FeignClientService {
    @GetMapping("/hello")
    String hello();
}
