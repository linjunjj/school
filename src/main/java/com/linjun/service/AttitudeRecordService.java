package com.linjun.service;

import com.linjun.model.AttitudeRecord;

public interface AttitudeRecordService {
    public  int insert(AttitudeRecord attitudeRecord);
    public  int update(int userID,AttitudeRecord attitudeRecord);
    public  int  delete(int userId);

}
