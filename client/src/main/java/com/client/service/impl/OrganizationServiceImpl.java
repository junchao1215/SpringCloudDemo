package com.client.service.impl;

import com.client.service.OrganizationService;
import dubbo.api.OrganzationDubboApi;
import entity.Organ;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @DubboReference(check = false,timeout = 600000 , retries = 0)
    OrganzationDubboApi organzationDubboApi;
    @Override
    public void edit(Organ organ) {
        organzationDubboApi.edit(organ);
    }




}
