package com.linjun.dao;

import com.linjun.model.PlateAdmin;
import com.linjun.model.PlateAdminCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlateAdminMapper {
    long countByExample(PlateAdminCriteria example);

    int deleteByExample(PlateAdminCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlateAdmin record);

    int insertSelective(PlateAdmin record);

    List<PlateAdmin> selectByExample(PlateAdminCriteria example);

    PlateAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlateAdmin record, @Param("example") PlateAdminCriteria example);

    int updateByExample(@Param("record") PlateAdmin record, @Param("example") PlateAdminCriteria example);

    int updateByPrimaryKeySelective(PlateAdmin record);

    int updateByPrimaryKey(PlateAdmin record);
}