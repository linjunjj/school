package com.linjun.service;

import com.linjun.model.User;
import com.linjun.model.UserDetail;

public interface UserDetailService {
    public int inserts(UserDetail userDetail);
    public int deletesById(int id);
    public  int updatedate(int id,UserDetail userDetail);

}
