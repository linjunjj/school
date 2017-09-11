package com.linjun.dao;

import com.linjun.model.Admin;
import com.linjun.model.AdminCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminMapper {
    long countByExample(AdminCriteria example);//select count(*) from user where username='joe'

    int deleteByExample(AdminCriteria example);//delete from user where username='joe'

    int deleteByPrimaryKey(Integer id);//delete from user where id=101

    int insert(Admin record);//insert into user(ID,username,password,email) values(101,'test','123456','674531003@qq.com');

    int insertSelective(Admin record);//int insertSelective(Account record);

    List<Admin> selectByExample(AdminCriteria example);

    Admin selectByPrimaryKey(Integer id);//相当于select * from user where id = 变量id

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminCriteria example);
    //update user set password='123' where username='joe'

    int updateByExample(@Param("record") Admin record, @Param("example") AdminCriteria example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}