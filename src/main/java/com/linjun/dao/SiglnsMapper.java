package com.linjun.dao;

import com.linjun.model.Siglns;
import com.linjun.model.SiglnsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SiglnsMapper {
    long countByExample(SiglnsCriteria example);

    int deleteByExample(SiglnsCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Siglns record);

    int insertSelective(Siglns record);

    List<Siglns> selectByExample(SiglnsCriteria example);

    Siglns selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Siglns record, @Param("example") SiglnsCriteria example);

    int updateByExample(@Param("record") Siglns record, @Param("example") SiglnsCriteria example);

    int updateByPrimaryKeySelective(Siglns record);

    int updateByPrimaryKey(Siglns record);
}