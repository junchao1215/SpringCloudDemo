package com.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.HomeWorkLevelMapper;
import com.server.mapper.HomeWorkMapper;
import com.server.service.HomeWorkService;
import entity.HomeWork;
import entity.HomeWorkLevel;
import entity.StudentLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeWorkServiceImpl extends ServiceImpl<HomeWorkMapper, HomeWork> implements HomeWorkService {
    @Autowired
    HomeWorkMapper homeWorkMapper;
    @Autowired
    HomeWorkLevelMapper homeWorkLevelMapper;
    public HomeWork getHomeWork(Long id) {
        return homeWorkMapper.selectHomeWorkById(id);
    }

    @Override
    public void saveHomeWork(HomeWork homeWork) {
        if(homeWork.getId() == 0){
            homeWorkMapper.insert(homeWork);
        }
        else{
            homeWorkMapper.updateById(homeWork);
        }

        QueryWrapper<HomeWorkLevel> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("home_work",homeWork.getId());
        homeWorkLevelMapper.delete(queryWrapper);

        homeWork.getLevels().forEach(level -> {
            HomeWorkLevel homeWorkLevel = HomeWorkLevel.builder()
                    .homeWork(homeWork.getId())
                    .level(level.getId()).build();
            homeWorkLevelMapper.insert(homeWorkLevel);
        });
    }
}
