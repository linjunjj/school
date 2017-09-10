package com.linjun.service;

import com.linjun.model.Admin;

import java.util.List;

public interface AdminService {
    public boolean add(Admin admin);
    public List<Admin> findAll();

}
