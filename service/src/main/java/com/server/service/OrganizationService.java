package com.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import dto.OrganRequest;
import entity.Organ;

public interface OrganizationService extends IService<Organ> {
    void saveOrganization(Organ organ);
}
