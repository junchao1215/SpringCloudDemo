package com.server.service.impl;

import com.aliyun.oss.common.utils.StringUtils;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.LevelMapper;
import com.server.mapper.TeacherLevelMapper;
import com.server.service.LevelService;
import entity.Level;
import entity.TeacherLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LevelServiceImpl extends ServiceImpl<LevelMapper, Level> implements LevelService {
    @Autowired
    private LevelMapper levelMapper;
    @Autowired
    private TeacherLevelMapper teacherLevelMapper;
    @Override
    public List<Level> getLevelByTeacherNo(String teacherno) {

        return levelMapper.getLevelByTeacherNo(teacherno);
    }

    @Override
    @Transactional
    public void saveLevel(Level level) {
        if(level.getId() == 0){
            levelMapper.insert(level);
        }
        else{
            levelMapper.updateById(level);
        }

        QueryWrapper<TeacherLevel> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("level",level.getId());
        teacherLevelMapper.delete(queryWrapper);

        level.getTeachers().forEach(teacher -> {
            TeacherLevel teacherLevel = TeacherLevel.builder()
                    .teacher(teacher.getId())
                    .level(level.getId()).build();
            teacherLevelMapper.insert(teacherLevel);
        });
    }
}
