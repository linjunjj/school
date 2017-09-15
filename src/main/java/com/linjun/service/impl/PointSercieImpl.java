package com.linjun.service.impl;

import com.linjun.dao.PointMapper;
import com.linjun.model.Point;
import com.linjun.model.PointCriteria;
import com.linjun.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointSercieImpl implements PointService {
    @Autowired
    PointMapper pointMapper;

    public int insert(Point point) {
        return pointMapper.insert(point);
    }

    public int update(int userid, Point point) {
        PointCriteria pointCriteria=new PointCriteria();
        PointCriteria.Criteria criteria=pointCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);

        return pointMapper.updateByExample(point,pointCriteria);
    }

    public int delete(int userid) {
        PointCriteria pointCriteria=new PointCriteria();
        PointCriteria.Criteria criteria=pointCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);
        return pointMapper.deleteByExample(pointCriteria);
    }
}
