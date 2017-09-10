package com.linjun.dao;

import com.linjun.model.Theme;
import com.linjun.model.ThemeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThemeMapper {
    long countByExample(ThemeCriteria example);

    int deleteByExample(ThemeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Theme record);

    int insertSelective(Theme record);

    List<Theme> selectByExample(ThemeCriteria example);

    Theme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Theme record, @Param("example") ThemeCriteria example);

    int updateByExample(@Param("record") Theme record, @Param("example") ThemeCriteria example);

    int updateByPrimaryKeySelective(Theme record);

    int updateByPrimaryKey(Theme record);
}