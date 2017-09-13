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
    private AdminMapper adminMapper;
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

    public int counts(String name) {
        AdminCriteria adminCriteria1=new AdminCriteria();
        AdminCriteria.Criteria criteria=adminCriteria1.createCriteria();
        criteria.andAdminaccountEqualTo(name);
        return (int) adminMapper.countByExample(adminCriteria1);
    }

    public int deletes(String a) {
        AdminCriteria adminCriteria=new AdminCriteria();
        AdminCriteria.Criteria criteria=adminCriteria.createCriteria();
        criteria.andAdminaccountEqualTo(a);
        return adminMapper.deleteByExample(adminCriteria);
    }

    public int deletesBykey(int a) {
        return adminMapper.deleteByPrimaryKey(a);
    }

    public int inserts(Admin admin) {

        return adminMapper.insert(admin);
    }

    public int insertSelectives(Admin admin) {
        return 0;
    }

    public Admin findByKey(int a) {
        return adminMapper.selectByPrimaryKey(a);
    }

    public List<Admin> selectBycondition(String ...arg) {
        AdminCriteria adminCriteria2=new AdminCriteria();
        AdminCriteria.Criteria criteria=adminCriteria2.createCriteria();
        for (int i = 0; i <arg.length ; i++) {
            criteria.andAdminaccountEqualTo(arg[i]);
        }

        return adminMapper.selectByExample(adminCriteria2);
    }

    public int updateAdmin(int id,Admin admin) {
         AdminCriteria adminCriteria=new AdminCriteria();
        AdminCriteria.Criteria criteria=adminCriteria.createCriteria();
        criteria.andIdEqualTo(id);
        return adminMapper.updateByExampleSelective(admin,adminCriteria);
    }

    public List<Admin> findByName(String adminName) {
        AdminCriteria adminCriteria=new AdminCriteria();
        AdminCriteria.Criteria criteria=adminCriteria.createCriteria();
        criteria.andAdminaccountEqualTo(adminName);
        return adminMapper.selectByExample(adminCriteria);
    }

    public int updateAdminbyName(String name, Admin admin) {
        AdminCriteria adminCriteria=new AdminCriteria();
        AdminCriteria.Criteria criteria=adminCriteria.createCriteria();
        criteria.andAdminaccountEqualTo(name);
        return adminMapper.updateByExample(admin,adminCriteria);
    }

}
