package com.linjun.dao;

import com.linjun.model.AttentionUser;
import com.linjun.model.AttentionUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttentionUserMapper {
    long countByExample(AttentionUserCriteria example);

    int deleteByExample(AttentionUserCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttentionUser record);

    int insertSelective(AttentionUser record);

    List<AttentionUser> selectByExample(AttentionUserCriteria example);

    AttentionUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttentionUser record, @Param("example") AttentionUserCriteria example);

    int updateByExample(@Param("record") AttentionUser record, @Param("example") AttentionUserCriteria example);

    int updateByPrimaryKeySelective(AttentionUser record);

    int updateByPrimaryKey(AttentionUser record);
}