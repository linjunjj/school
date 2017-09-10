package com.linjun.dao;

import com.linjun.model.ThirdParty;
import com.linjun.model.ThirdPartyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdPartyMapper {
    long countByExample(ThirdPartyCriteria example);

    int deleteByExample(ThirdPartyCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThirdParty record);

    int insertSelective(ThirdParty record);

    List<ThirdParty> selectByExample(ThirdPartyCriteria example);

    ThirdParty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThirdParty record, @Param("example") ThirdPartyCriteria example);

    int updateByExample(@Param("record") ThirdParty record, @Param("example") ThirdPartyCriteria example);

    int updateByPrimaryKeySelective(ThirdParty record);

    int updateByPrimaryKey(ThirdParty record);
}