package com.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import entity.Level;

import java.util.List;

public interface LevelService extends IService<Level> {
    List<Level> getLevelByTeacherNo(String teacherNo);
    void saveLevel(Level level);
}
