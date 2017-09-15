package com.linjun.service;

import com.linjun.model.Point;

public interface PointService {
 public  int insert(Point point);
 public  int update(int userid,Point point);
    public  int delete(int userid);
}
