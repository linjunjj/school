package com.linjun.dao;

import com.linjun.model.Contentltem;
import com.linjun.model.ContentltemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentltemMapper {
    long countByExample(ContentltemCriteria example);

    int deleteByExample(ContentltemCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contentltem record);

    int insertSelective(Contentltem record);

    List<Contentltem> selectByExample(ContentltemCriteria example);

    Contentltem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contentltem record, @Param("example") ContentltemCriteria example);

    int updateByExample(@Param("record") Contentltem record, @Param("example") ContentltemCriteria example);

    int updateByPrimaryKeySelective(Contentltem record);

    int updateByPrimaryKey(Contentltem record);
}