package com.client.feign.Fallback;

import com.client.feign.OrganFeignClientService;
import entity.Organ;
import org.springframework.stereotype.Component;

@Component
public class OrganFeignServiceFallback implements OrganFeignClientService {


    @Override
    public void editOrgan(Organ organ) {

    }
}
