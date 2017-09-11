package com.linjun.dao;

import com.linjun.model.ColumnAdmin;
import com.linjun.model.ColumnAdminCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ColumnAdminMapper {
    long countByExample(ColumnAdminCriteria example);

    int deleteByExample(ColumnAdminCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ColumnAdmin record);

    int insertSelective(ColumnAdmin record);

    List<ColumnAdmin> selectByExample(ColumnAdminCriteria example);

    ColumnAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ColumnAdmin record, @Param("example") ColumnAdminCriteria example);

    int updateByExample(@Param("record") ColumnAdmin record, @Param("example") ColumnAdminCriteria example);

    int updateByPrimaryKeySelective(ColumnAdmin record);

    int updateByPrimaryKey(ColumnAdmin record);
}