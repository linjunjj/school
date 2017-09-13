package com.linjun.service.impl;

import com.linjun.dao.AttitudeRecordMapper;
import com.linjun.model.AttitudeRecord;
import com.linjun.model.AttitudeRecordCriteria;
import com.linjun.service.AttitudeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttitudeRecordServiceImpl implements AttitudeRecordService{
    @Autowired
    AttitudeRecordMapper attitudeRecordMapper;
    public int insert(AttitudeRecord attitudeRecord) {
        return attitudeRecordMapper.insert(attitudeRecord);
    }

    public int update(int userID,AttitudeRecord attitudeRecord) {
        AttitudeRecordCriteria attitudeRecordCriteria=new AttitudeRecordCriteria();
        AttitudeRecordCriteria.Criteria criteria=attitudeRecordCriteria.createCriteria();
        criteria.andUseridEqualTo(userID);

        return attitudeRecordMapper.updateByExample(attitudeRecord,attitudeRecordCriteria);
    }
    public int delete(int userId) {
        AttitudeRecordCriteria attitudeRecordCriteria=new AttitudeRecordCriteria();
        AttitudeRecordCriteria.Criteria criteria=attitudeRecordCriteria.createCriteria();
        criteria.andUseridEqualTo(userId);
        return attitudeRecordMapper.deleteByExample(attitudeRecordCriteria);
    }
}
