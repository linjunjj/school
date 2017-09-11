package com.linjun.service;

import com.linjun.model.User;

import java.util.List;

public interface UserService {
    public  int inserts(User user);
    public  int updateUser(int id,User user);
    public  int deleteByKey(int id);
    public  int deleteByContant(String username);
    public List<User> findAll();
    public  User findById(int id);
    public List<User> findByUserName(String username);
}
