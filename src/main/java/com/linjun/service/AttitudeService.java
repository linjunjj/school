package com.linjun.service;

import com.linjun.model.Attitude;

public interface AttitudeService {
    public  int insert(Attitude attitude);
    public  int update(int UserID,Attitude attitude);
    public  int delete(int userID);


}
