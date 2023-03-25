package com.client.service.impl;

import com.client.feign.CRUDFeignClientService;
import com.client.service.ParentService;
import entity.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentServiceImpl implements ParentService {
    @Autowired
    CRUDFeignClientService crudFeignClientService;
    @Override
    public void edit(Parent parent) {

        crudFeignClientService.editParent(parent);
    }

    @Override
    public Parent getById(Parent parent) {
        crudFeignClientService.getParentById(parent);
        return null;
    }

    @Override
    public List<Parent> findAll(Parent parent) {
        crudFeignClientService.findAllParent(parent);
        return null;
    }
}
