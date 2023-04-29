package com.client.feign.Fallback;

import com.client.feign.ParentFeignClientService;
import common.Result;
import entity.Parent;
import org.springframework.stereotype.Component;

@Component
public class ParentFeignServiceFallback implements ParentFeignClientService {

    @Override
    public Result<Parent> editParent(Parent parent) {
        return null;
    }

    @Override
    public void getParentById(Parent parent) {

    }

    @Override
    public void findAllParent(Parent parent) {

    }
}
