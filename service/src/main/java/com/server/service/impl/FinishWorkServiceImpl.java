package com.server.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.mapper.AttachMapper;
import com.server.mapper.FinishWorkMapper;
import com.server.service.FinishWorkService;
import entity.Attach;
import entity.FinishHomeWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FinishWorkServiceImpl extends ServiceImpl<FinishWorkMapper, FinishHomeWork> implements FinishWorkService {
    @Autowired
    private FinishWorkMapper finishWorkMapper;
    @Autowired
    private AttachMapper attachMapper;
    public FinishHomeWork getHomeWork(Long id) {
        return finishWorkMapper.getFinishHomeWorkById(id);
    }
    @Transactional
    public void saveFinishHomeWork(FinishHomeWork work) {
        finishWorkMapper.insert(work);
        work.getUrl().stream().forEach(url->{
            Attach attach = Attach.builder()
                    .busiId(work.getId())
                    .url(url)
                    .build();
            attachMapper.insert(attach);
        });


    }
}
