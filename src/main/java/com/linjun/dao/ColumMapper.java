package com.linjun.dao;

import com.linjun.model.Colum;
import com.linjun.model.ColumCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ColumMapper {
    long countByExample(ColumCriteria example);

    int deleteByExample(ColumCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Colum record);

    int insertSelective(Colum record);

    List<Colum> selectByExample(ColumCriteria example);

    Colum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Colum record, @Param("example") ColumCriteria example);

    int updateByExample(@Param("record") Colum record, @Param("example") ColumCriteria example);

    int updateByPrimaryKeySelective(Colum record);

    int updateByPrimaryKey(Colum record);
}