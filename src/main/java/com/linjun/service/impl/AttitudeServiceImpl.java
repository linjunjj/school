package com.linjun.service.impl;

import com.linjun.dao.AttitudeMapper;
import com.linjun.model.Attitude;
import com.linjun.model.AttitudeCriteria;
import com.linjun.service.AttitudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttitudeServiceImpl implements AttitudeService {
    @Autowired
    AttitudeMapper attitudeMapper;

    public int insert(Attitude attitude) {
        return attitudeMapper.insert(attitude);
    }

    public int update(int userId,Attitude attitude) {
        AttitudeCriteria attitudeCriteria=new AttitudeCriteria();
        AttitudeCriteria.Criteria criteria=attitudeCriteria.createCriteria();
        criteria.andUseridEqualTo(userId);
        return attitudeMapper.updateByExample(attitude,attitudeCriteria);
    }

    public int delete(int userID) {
        AttitudeCriteria attitudeCriteria=new AttitudeCriteria();
        AttitudeCriteria.Criteria criteria=attitudeCriteria.createCriteria();
        criteria.andUseridEqualTo(userID);

        return attitudeMapper.deleteByExample(attitudeCriteria);
    }
}
