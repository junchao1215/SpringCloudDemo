package com.client.service.impl;

import com.client.feign.OrganFeignClientService;
import com.client.service.OrganizationService;
import entity.Organ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    OrganFeignClientService organFeignClientService;
    @Override
    public void edit(Organ organ) {

        organFeignClientService.editOrgan(organ);
    }




}
