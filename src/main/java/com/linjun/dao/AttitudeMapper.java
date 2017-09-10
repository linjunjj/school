package com.linjun.dao;

import com.linjun.model.Attitude;
import com.linjun.model.AttitudeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttitudeMapper {
    long countByExample(AttitudeCriteria example);

    int deleteByExample(AttitudeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attitude record);

    int insertSelective(Attitude record);

    List<Attitude> selectByExample(AttitudeCriteria example);

    Attitude selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Attitude record, @Param("example") AttitudeCriteria example);

    int updateByExample(@Param("record") Attitude record, @Param("example") AttitudeCriteria example);

    int updateByPrimaryKeySelective(Attitude record);

    int updateByPrimaryKey(Attitude record);
}