package com.linjun.service;

import com.linjun.model.Plate;

public interface PlateService {
    public int insert(Plate plate);
    public  int update(int userid,Plate plate);
    public  int delete(int userid);


}
