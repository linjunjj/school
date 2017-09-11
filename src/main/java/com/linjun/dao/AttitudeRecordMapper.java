package com.linjun.dao;

import com.linjun.model.AttitudeRecord;
import com.linjun.model.AttitudeRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttitudeRecordMapper {
    long countByExample(AttitudeRecordCriteria example);

    int deleteByExample(AttitudeRecordCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttitudeRecord record);

    int insertSelective(AttitudeRecord record);

    List<AttitudeRecord> selectByExample(AttitudeRecordCriteria example);

    AttitudeRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttitudeRecord record, @Param("example") AttitudeRecordCriteria example);

    int updateByExample(@Param("record") AttitudeRecord record, @Param("example") AttitudeRecordCriteria example);

    int updateByPrimaryKeySelective(AttitudeRecord record);

    int updateByPrimaryKey(AttitudeRecord record);
}