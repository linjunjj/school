package com.linjun.service.impl;

import com.linjun.dao.ThirdPartyMapper;
import com.linjun.model.ThirdParty;
import com.linjun.model.ThirdPartyCriteria;
import com.linjun.service.ThirdParthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThirtdParthServiceImpl implements ThirdParthService {
    @Autowired
   private ThirdPartyMapper thirdPartyMapper;

    public int inserts(ThirdParty thirdParty) {
        return  thirdPartyMapper.insert(thirdParty);
    }

    public int deleteByUserID(int id) {
         ThirdPartyCriteria thirdPartyCriteria=new ThirdPartyCriteria();
        ThirdPartyCriteria.Criteria criteria=thirdPartyCriteria.createCriteria();
         criteria.andUseridEqualTo(id);
        return thirdPartyMapper.deleteByExample(thirdPartyCriteria);
    }

    public int updates(int id, ThirdParty thirdParty) {
        ThirdPartyCriteria thirdPartyCriteria=new ThirdPartyCriteria();
        ThirdPartyCriteria.Criteria criteria=thirdPartyCriteria.createCriteria();
        criteria.andIdEqualTo(id);
        return thirdPartyMapper.updateByExampleSelective(thirdParty,thirdPartyCriteria);
    }

    public int updatesThird(ThirdParty thirdParty) {
        return thirdPartyMapper.updateByPrimaryKey(thirdParty);
    }
}
