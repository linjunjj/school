package com.linjun.dao;

import com.linjun.model.Reprot;
import com.linjun.model.ReprotCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReprotMapper {
    long countByExample(ReprotCriteria example);

    int deleteByExample(ReprotCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reprot record);

    int insertSelective(Reprot record);

    List<Reprot> selectByExample(ReprotCriteria example);

    Reprot selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reprot record, @Param("example") ReprotCriteria example);

    int updateByExample(@Param("record") Reprot record, @Param("example") ReprotCriteria example);

    int updateByPrimaryKeySelective(Reprot record);

    int updateByPrimaryKey(Reprot record);
}