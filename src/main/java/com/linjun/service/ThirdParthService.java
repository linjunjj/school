package com.linjun.service;

import com.linjun.model.ThirdParty;

public interface ThirdParthService {
    public  int inserts(ThirdParty thirdParty);
    public  int deleteByUserID(int id);
    public  int updates(int userId,ThirdParty thirdParty);
    public  int updatesThird(ThirdParty thirdParty);
}
