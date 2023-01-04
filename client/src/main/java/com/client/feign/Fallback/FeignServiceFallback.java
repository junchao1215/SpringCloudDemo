package com.client.feign.Fallback;

import com.client.feign.FeignClientService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallback implements FeignClientService {
    public String hello() {
        return "--------------";
    }
}
