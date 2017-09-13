package com.linjun.service;

import com.linjun.model.Rank;

public interface RankService {
    public int insert(Rank rank);
    public  int update(int userid,Rank rank);
    public  int delete(int userid);

}
