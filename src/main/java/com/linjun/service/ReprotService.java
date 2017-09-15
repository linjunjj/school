package com.linjun.service;

import com.linjun.model.Reprot;

public interface ReprotService {
    public  int insert(Reprot reprot);
    public  int  update(int userid,Reprot reprot);
    public  int delete(int userid);

}
