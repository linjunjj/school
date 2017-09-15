package com.linjun.service.impl;

import com.linjun.dao.PlateMapper;
import com.linjun.model.Plate;
import com.linjun.model.PlateCriteria;
import com.linjun.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlateServiceImpl implements PlateService {
    @Autowired
    PlateMapper plateMapper;
    public int insert(Plate plate) {
        return plateMapper.insert(plate);
    }

    public int update(int id, Plate plate) {
        PlateCriteria plateCriteria=new PlateCriteria();
        PlateCriteria.Criteria criteria=plateCriteria.createCriteria();
        criteria.andIdEqualTo(id);
        return plateMapper.updateByExample(plate,plateCriteria);
    }

    public int delete(int id) {

        return plateMapper.deleteByPrimaryKey(id);
    }
}
