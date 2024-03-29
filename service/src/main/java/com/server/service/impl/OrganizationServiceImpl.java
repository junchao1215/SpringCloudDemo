package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.OrganizationMapper;
import com.server.service.OrganizationService;
import entity.Organ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl extends ServiceImpl<OrganizationMapper, Organ> implements OrganizationService {
    @Autowired
    private OrganizationMapper organizationMapper;

    public void saveOrganization(Organ organ){

        organizationMapper.insert(organ);
    }

}
