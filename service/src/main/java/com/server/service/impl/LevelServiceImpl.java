package com.server.service.impl;

import com.aliyun.oss.common.utils.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.LevelMapper;
import com.server.service.LevelService;
import entity.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LevelServiceImpl extends ServiceImpl<LevelMapper, Level> implements LevelService {
    @Autowired
    private LevelMapper levelMapper;
    @Override
    public List<Level> getLevelByTeacherNo(String teacherno) {

        return levelMapper.getLevelByTeacherNo(teacherno);
    }

    @Override
    @Transactional
    public void saveLevel(Level level) {
        level.getTeachers().forEach(teacher -> {
            level.setTeacherNo(teacher.getTeacherNo());

            if(level.getId() == 0){
                levelMapper.insert(level);
            }
            else{
                levelMapper.updateById(level);
            }
        });
    }
}