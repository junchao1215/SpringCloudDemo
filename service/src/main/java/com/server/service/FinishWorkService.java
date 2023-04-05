package com.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import entity.FinishHomeWork;

public interface FinishWorkService extends IService<FinishHomeWork> {
    FinishHomeWork getHomeWork(Long id);
    void saveFinishHomeWork(FinishHomeWork work);
}
