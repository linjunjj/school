package com.linjun.dao;

import com.linjun.model.Point;
import com.linjun.model.PointCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointMapper {
    long countByExample(PointCriteria example);

    int deleteByExample(PointCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Point record);

    int insertSelective(Point record);

    List<Point> selectByExample(PointCriteria example);

    Point selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Point record, @Param("example") PointCriteria example);

    int updateByExample(@Param("record") Point record, @Param("example") PointCriteria example);

    int updateByPrimaryKeySelective(Point record);

    int updateByPrimaryKey(Point record);
}