package com.linjun.service.impl;

import com.linjun.dao.AdminMapper;
import com.linjun.model.Admin;
import com.linjun.model.AdminCriteria;
import com.linjun.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    public AdminMapper adminMapper;
    public boolean add(Admin admin) {
        return adminMapper.insert(admin)>0;
    }
    public List<Admin> findAll() {
        AdminCriteria adminCriteria=new AdminCriteria();
       List<Admin> adminList= adminMapper.selectByExample(adminCriteria);
        if (adminList!=null){
            return adminList;
        }
            return adminList;
    }

}
