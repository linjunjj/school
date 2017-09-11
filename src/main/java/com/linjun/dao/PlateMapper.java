package com.linjun.dao;

import com.linjun.model.Plate;
import com.linjun.model.PlateCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlateMapper {
    long countByExample(PlateCriteria example);

    int deleteByExample(PlateCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Plate record);

    int insertSelective(Plate record);

    List<Plate> selectByExample(PlateCriteria example);

    Plate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Plate record, @Param("example") PlateCriteria example);

    int updateByExample(@Param("record") Plate record, @Param("example") PlateCriteria example);

    int updateByPrimaryKeySelective(Plate record);

    int updateByPrimaryKey(Plate record);
}