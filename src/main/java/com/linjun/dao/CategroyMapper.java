package com.linjun.dao;

import com.linjun.model.Categroy;
import com.linjun.model.CategroyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategroyMapper {
    long countByExample(CategroyCriteria example);

    int deleteByExample(CategroyCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Categroy record);

    int insertSelective(Categroy record);

    List<Categroy> selectByExample(CategroyCriteria example);

    Categroy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Categroy record, @Param("example") CategroyCriteria example);

    int updateByExample(@Param("record") Categroy record, @Param("example") CategroyCriteria example);

    int updateByPrimaryKeySelective(Categroy record);

    int updateByPrimaryKey(Categroy record);
}