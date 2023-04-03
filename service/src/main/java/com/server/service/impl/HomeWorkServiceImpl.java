package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.HomeWorkMapper;
import com.server.service.HomeWorkService;
import entity.HomeWork;
import org.springframework.stereotype.Service;

@Service
public class HomeWorkServiceImpl extends ServiceImpl<HomeWorkMapper, HomeWork> implements HomeWorkService {

}
