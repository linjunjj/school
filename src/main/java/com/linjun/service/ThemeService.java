package com.linjun.service;


import com.linjun.model.Theme;

public interface ThemeService {
    public  int insert(Theme theme);
    public  int update(int id,Theme theme);
    public  int delete(int id);

}
