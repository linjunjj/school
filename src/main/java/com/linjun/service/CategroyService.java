package com.linjun.service;

import com.linjun.model.Categroy;

public interface CategroyService {
    public  int insert(Categroy categroy);
    public  int update(int id,Categroy categroy);
    public  int delete(int id);
}
