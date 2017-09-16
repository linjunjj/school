package com.linjun.service;

import com.linjun.model.PlateAdmin;

public interface PlateAdminService {
    public  int insert(PlateAdmin plateAdmin);
    public  int  update(int userid,PlateAdmin plateAdmin);
    public  int delete(int userid);
}
