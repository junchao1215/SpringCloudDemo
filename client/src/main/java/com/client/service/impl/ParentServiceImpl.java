package com.client.service.impl;

import com.client.feign.ParentFeignClientService;
import com.client.service.ParentService;
import com.client.service.UserService;
import entity.Parent;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentServiceImpl implements ParentService {
    @Autowired
    ParentFeignClientService parentFeignClientService;
    @Autowired
    private UserService userService;
    @Override
    public void edit(Parent parent) {
        User user =User.builder()
                .userName(parent.getIdNo())
                .nickName(parent.getParentNm())
                .build();
        userService.saveUser(user);
        parentFeignClientService.editParent(parent);
    }

    @Override
    public Parent getById(Parent parent) {
        parentFeignClientService.getParentById(parent);
        return null;
    }

    @Override
    public List<Parent> findAll(Parent parent) {
        parentFeignClientService.findAllParent(parent);
        return null;
    }
}
