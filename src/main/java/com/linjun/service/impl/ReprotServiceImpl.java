package com.linjun.service.impl;

import com.linjun.dao.ReprotMapper;
import com.linjun.model.Reprot;
import com.linjun.model.ReprotCriteria;
import com.linjun.service.ReprotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReprotServiceImpl implements ReprotService {
    @Autowired
    ReprotMapper reprotMapper;

    public int insert(Reprot reprot) {
        return reprotMapper.insert(reprot);
    }

    public int update(int userid, Reprot reprot) {
        ReprotCriteria reprotCriteria=new ReprotCriteria();
        ReprotCriteria.Criteria criteria=reprotCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);

        return reprotMapper.updateByExample(reprot,reprotCriteria);
    }

    public int delete(int userid) {
        ReprotCriteria reprotCriteria=new ReprotCriteria();
        ReprotCriteria.Criteria criteria=reprotCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);
        return reprotMapper.deleteByExample(reprotCriteria);
    }
}
