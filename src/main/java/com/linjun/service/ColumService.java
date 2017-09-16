package com.linjun.service;

import com.linjun.model.Colum;
import com.linjun.model.ColumCriteria;

public interface ColumService {
    public  int insert(Colum colum);
    public  int  update(int id, Colum colum);
    public  int delete(int id);

}
