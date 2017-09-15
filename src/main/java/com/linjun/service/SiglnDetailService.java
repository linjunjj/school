package com.linjun.service;

import com.linjun.model.SiglnsDetail;

public interface SiglnDetailService {
    public  int insert(SiglnsDetail siglnsDetail);
   public  int update(int userid,SiglnsDetail siglnsDetail);
   public  int delete(int useid);

}
