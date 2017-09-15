package com.linjun.service;

import com.linjun.model.Siglns;

public interface Siglnservice {
    public int insert(Siglns siglns);
    public int update(int userid,Siglns siglns);
    public  int delete(int  userid);
}
