package com.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import entity.HomeWork;

public interface HomeWorkService extends IService<HomeWork> {
    HomeWork getHomeWork(Long id);
}
