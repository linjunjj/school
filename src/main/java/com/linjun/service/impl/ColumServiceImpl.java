package com.linjun.service.impl;

import com.linjun.dao.ColumMapper;
import com.linjun.model.Colum;
import com.linjun.model.ColumCriteria;
import com.linjun.service.ColumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColumServiceImpl implements ColumService {
    @Autowired
    ColumMapper columMapper;

    public int insert(Colum colum) {
        return columMapper.insert(colum);
    }

    public int update(int id, Colum colum) {
        ColumCriteria columCriteria=new ColumCriteria();
        ColumCriteria.Criteria criteria=columCriteria.createCriteria();
        criteria.andIdEqualTo(id);

        return columMapper.insert(colum);
    }

    public int delete(int id) {


        return columMapper.deleteByPrimaryKey(id);
    }
}
