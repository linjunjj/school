package com.linjun.service.impl;

import com.linjun.dao.UserDetailMapper;
import com.linjun.model.User;
import com.linjun.model.UserDetail;
import com.linjun.model.UserDetailCriteria;
import com.linjun.service.UserDetailService;
import com.linjun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserDetailServiceImpl implements UserDetailService {
    @Autowired
    UserDetailMapper userDetailMapper;

    public int inserts(UserDetail userDetail) {
        return userDetailMapper.insert(userDetail);
    }

    public int deletesById(int id) {
        return userDetailMapper.deleteByPrimaryKey(id);
    }

    public int updatedate(int id, UserDetail userDetail) {
        UserDetailCriteria userDetailCriteria=new UserDetailCriteria();
        UserDetailCriteria.Criteria criteria=userDetailCriteria.createCriteria();
        criteria.andIdEqualTo(id);
        return userDetailMapper.updateByExampleSelective(userDetail,userDetailCriteria);
    }


}
