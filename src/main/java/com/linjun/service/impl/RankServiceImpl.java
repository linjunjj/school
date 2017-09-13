package com.linjun.service.impl;

import com.linjun.dao.RankMapper;
import com.linjun.model.Rank;
import com.linjun.model.RankCriteria;
import com.linjun.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankServiceImpl implements RankService {
    @Autowired
    RankMapper rankMapper;
    public int insert(Rank rank) {
        return rankMapper.insert(rank);
    }

    public int update(int userid, Rank rank) {
        RankCriteria rankCriteria=new RankCriteria();
        RankCriteria.Criteria criteria=rankCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);

        return rankMapper.updateByExample(rank,rankCriteria);
    }
    public int delete(int userid) {
        RankCriteria rankCriteria=new RankCriteria();
        RankCriteria.Criteria criteria=rankCriteria.createCriteria();
        criteria.andUseridEqualTo(userid);
        return rankMapper.deleteByExample(rankCriteria);
    }
}
