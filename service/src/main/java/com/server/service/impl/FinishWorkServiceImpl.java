package com.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.FinishWorkMapper;
import com.server.service.FinishWorkService;
import entity.FinishHomeWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinishWorkServiceImpl extends ServiceImpl<FinishWorkMapper, FinishHomeWork> implements FinishWorkService {
    @Autowired
    private FinishWorkMapper finishWorkMapper;
    public FinishHomeWork getHomeWork(Long id) {
        return finishWorkMapper.getFinishHomeWorkById(id);
    }
}
