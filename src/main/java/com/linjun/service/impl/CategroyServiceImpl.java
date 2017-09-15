package com.linjun.service.impl;

import com.linjun.dao.CategroyMapper;
import com.linjun.model.Categroy;
import com.linjun.model.CategroyCriteria;
import com.linjun.service.CategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategroyServiceImpl implements CategroyService{
    @Autowired
    CategroyMapper categroyMapper;
    public int insert(Categroy categroy) {
        return categroyMapper.insert(categroy);
    }

    public int update(int id, Categroy categroy) {
        CategroyCriteria categroyCriteria=new CategroyCriteria();
        CategroyCriteria.Criteria criteria=categroyCriteria.createCriteria();
        criteria.andIdEqualTo(id);
        return categroyMapper.updateByExample(categroy,categroyCriteria);
    }

    public int delete(int id) {
        return categroyMapper.deleteByPrimaryKey(id);
    }
}
