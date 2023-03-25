package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.ParentMapper;
import com.server.service.ParentService;
import entity.Parent;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl extends ServiceImpl<ParentMapper, Parent> implements ParentService {

}
