package com.linjun.dao;

import com.linjun.model.Rank;
import com.linjun.model.RankCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankMapper {
    long countByExample(RankCriteria example);

    int deleteByExample(RankCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rank record);

    int insertSelective(Rank record);

    List<Rank> selectByExample(RankCriteria example);

    Rank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rank record, @Param("example") RankCriteria example);

    int updateByExample(@Param("record") Rank record, @Param("example") RankCriteria example);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);
}