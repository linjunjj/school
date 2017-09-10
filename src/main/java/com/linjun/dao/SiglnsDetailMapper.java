package com.linjun.dao;

import com.linjun.model.SiglnsDetail;
import com.linjun.model.SiglnsDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiglnsDetailMapper {
    long countByExample(SiglnsDetailCriteria example);

    int deleteByExample(SiglnsDetailCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SiglnsDetail record);

    int insertSelective(SiglnsDetail record);

    List<SiglnsDetail> selectByExample(SiglnsDetailCriteria example);

    SiglnsDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SiglnsDetail record, @Param("example") SiglnsDetailCriteria example);

    int updateByExample(@Param("record") SiglnsDetail record, @Param("example") SiglnsDetailCriteria example);

    int updateByPrimaryKeySelective(SiglnsDetail record);

    int updateByPrimaryKey(SiglnsDetail record);
}