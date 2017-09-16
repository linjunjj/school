package com.linjun.service.impl;

import com.linjun.dao.PlateAdminMapper;
import com.linjun.model.PlateAdmin;
import com.linjun.model.PlateAdminCriteria;
import com.linjun.service.PlateAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlateAdminServiceImpl implements PlateAdminService {
    @Autowired
    PlateAdminMapper plateAdminMapper;
    public int insert(PlateAdmin plateAdmin) {
        return plateAdminMapper.insert(plateAdmin);
    }

    public int update(int userid, PlateAdmin plateAdmin) {
        PlateAdminCriteria plateAdminCriteria=new PlateAdminCriteria();
        PlateAdminCriteria.Criteria criteria=plateAdminCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);
        return plateAdminMapper.updateByExample(plateAdmin,plateAdminCriteria);
    }

    public int delete(int userid) {
        PlateAdminCriteria plateAdminCriteria=new PlateAdminCriteria();
        PlateAdminCriteria.Criteria criteria=plateAdminCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);
        return plateAdminMapper.deleteByExample(plateAdminCriteria);
    }
}
