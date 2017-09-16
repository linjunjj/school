package com.linjun.service;

import com.linjun.model.Contentltem;

public interface ContentitemService {
    public  int insert(Contentltem contentltem);
    public  int update(int id,Contentltem contentltem);
    public  int delete(int id);
}
