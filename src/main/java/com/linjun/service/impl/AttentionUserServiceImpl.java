package com.linjun.service.impl;

import com.linjun.dao.AttentionUserMapper;
import com.linjun.model.AttentionUser;
import com.linjun.model.AttentionUserCriteria;
import com.linjun.model.AttitudeRecordCriteria;
import com.linjun.service.AttentionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttentionUserServiceImpl implements AttentionUserService {
    @Autowired
     AttentionUserMapper attentionUserMapper;

    public int insert(AttentionUser attentionUser) {
        return attentionUserMapper.insert(attentionUser);
    }

    public int updates(int name,AttentionUser attentionUser) {
        AttentionUserCriteria attentionUserCriteria=new AttentionUserCriteria();
        AttentionUserCriteria.Criteria criteria=attentionUserCriteria.createCriteria();
        criteria.andUseridEqualTo(name);
        return attentionUserMapper.updateByExample(attentionUser,attentionUserCriteria);
    }

    public int delete(int userID) {
        AttentionUserCriteria attentionUserCriteria=new AttentionUserCriteria();
        AttentionUserCriteria.Criteria criteria=attentionUserCriteria.createCriteria();
        criteria.andUseridEqualTo(userID);
        return attentionUserMapper.deleteByExample(attentionUserCriteria);
    }
}
