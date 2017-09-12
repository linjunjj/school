package com.linjun.service;

import com.linjun.model.AttentionUser;

public interface AttentionUserService {
    public int insert(AttentionUser attentionUser);
    public  int updates(AttentionUser attentionUser);
    public  int delete(int userID);
}
