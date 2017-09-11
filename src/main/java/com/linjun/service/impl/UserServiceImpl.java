package com.linjun.service.impl;

import com.linjun.dao.UserMapper;
import com.linjun.model.User;
import com.linjun.model.UserCriteria;
import com.linjun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
   @Autowired
    UserMapper userMapper;
    public int inserts(User user) {
        return userMapper.insert(user);
    }

    public int updateUser(int id, User user) {
        UserCriteria userCriteria=new UserCriteria();
        UserCriteria.Criteria criteria=userCriteria.createCriteria();
        criteria.andIdEqualTo(id);
        return userMapper.updateByExampleSelective(user,userCriteria);
    }

    public int deleteByKey(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public int deleteByContant(String username) {
        UserCriteria userCriteria=new UserCriteria();
        UserCriteria.Criteria criteria=userCriteria.createCriteria();
        criteria.andUsernameEqualTo(username);
        return userMapper.deleteByExample(userCriteria);
    }

    public List<User> findAll() {
        UserCriteria criteria=new UserCriteria();
        return userMapper.selectByExample(criteria);
    }

    public User findById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findByUserName(String username) {
        UserCriteria userCriteria=new UserCriteria();
        UserCriteria.Criteria criteria=userCriteria.createCriteria();
        criteria.andUsernameEqualTo(username);

        return userMapper.selectByExample(userCriteria);
    }
}
