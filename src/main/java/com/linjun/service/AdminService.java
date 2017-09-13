package com.linjun.service;

import com.linjun.model.Admin;

import java.util.List;

public interface AdminService {
    public boolean add(Admin admin);
    public List<Admin> findAll();
    public  int counts(String name);
    public  int deletes(String name);
    public  int deletesBykey(int a);
    public  int inserts(Admin admin);
    public  int insertSelectives(Admin admin);
    public Admin findByKey(int a);
    public  List<Admin> selectBycondition(String ...arg);
    public int updateAdmin(int id,Admin admin);
    public  List<Admin> findByName(String adminName);
    public  int updateAdminbyName(String name,Admin admin);
}
