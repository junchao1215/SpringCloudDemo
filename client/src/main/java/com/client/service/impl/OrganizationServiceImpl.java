package com.client.service.impl;

import com.client.feign.CRUDFeignClientService;
import com.client.service.OrganizationService;
import entity.Organ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    CRUDFeignClientService crudFeignClientService;
    @Override
    public void edit(Organ organ) {

        crudFeignClientService.editOrgan(organ);
    }




}
