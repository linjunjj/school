package com.linjun.service.impl;

import com.linjun.dao.SiglnsMapper;
import com.linjun.model.Siglns;
import com.linjun.model.SiglnsCriteria;
import com.linjun.service.Siglnservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiglnServiceImpl implements Siglnservice {
    @Autowired
    SiglnsMapper siglnsMapper;
    public int insert(Siglns siglns) {
        return siglnsMapper.insert(siglns);
    }
    public int update(int userid, Siglns siglns) {
        SiglnsCriteria siglnsCriteria=new SiglnsCriteria();
        SiglnsCriteria.Criteria criteria=siglnsCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);
        return siglnsMapper.updateByExample(siglns,siglnsCriteria);
    }

    public int delete(int userid) {
        SiglnsCriteria siglnsCriteria=new SiglnsCriteria();
        SiglnsCriteria.Criteria criteria=siglnsCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);
        return siglnsMapper.deleteByExample(siglnsCriteria);
    }
}
