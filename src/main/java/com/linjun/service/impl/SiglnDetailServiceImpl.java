package com.linjun.service.impl;

import com.linjun.dao.SiglnsDetailMapper;
import com.linjun.model.SiglnsDetail;
import com.linjun.model.SiglnsDetailCriteria;
import com.linjun.service.SiglnDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiglnDetailServiceImpl implements SiglnDetailService {
    @Autowired
    SiglnsDetailMapper siglnsDetailMapper;
    public int insert(SiglnsDetail siglnsDetail) {
        return siglnsDetailMapper.insert(siglnsDetail);
    }

    public int update(int userid, SiglnsDetail siglnsDetail) {
        SiglnsDetailCriteria siglnsDetailCriteria=new SiglnsDetailCriteria();
        SiglnsDetailCriteria.Criteria criteria=siglnsDetailCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);

        return siglnsDetailMapper.updateByExample(siglnsDetail,siglnsDetailCriteria);
    }

    public int delete(int useid) {
        SiglnsDetailCriteria siglnsDetailCriteria=new SiglnsDetailCriteria();
        SiglnsDetailCriteria.Criteria criteria=siglnsDetailCriteria.createCriteria();
        criteria.andUseridEqualTo(useid);

        return siglnsDetailMapper.deleteByExample(siglnsDetailCriteria);
    }
}
