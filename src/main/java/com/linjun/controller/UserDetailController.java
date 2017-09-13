package com.linjun.controller;

import com.linjun.model.UserDetail;
import com.linjun.service.UserDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value ="/userDetail")
@Api("用户细节测试")
public class UserDetailController {
    @Autowired
    UserDetailService userService;

    @PostMapping(value = "/inserts")
    @ApiOperation(value = "插入数据",notes = "吧数据插入数据库中",produces = "application/json")
    public int inserts(UserDetail userDetail){
        return userService.inserts(userDetail);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "删除数据",notes = "根据键值删除",produces = "application/json")
    public int delete(@PathVariable int id){

        return userService.deletesById(id);
    }
    @PutMapping(value = "/update/{userid}")
    @ApiOperation(value = "更新数据",notes = "根据id更新用户数据",produces = "application/json")
    public  boolean updatedate(@PathVariable int userid, String sex, Date birthday, int intergrity, String qq, String weixin, String weibo){
         UserDetail userDetail=new UserDetail();
         userDetail.setSex(sex);
         userDetail.setBirthday(birthday);
         userDetail.setQq(qq);
         userDetail.setIntegrity(intergrity);
         userDetail.setWeixin(weixin);
         userDetail.setWeibo(weibo);
        int a=userService.updatedate(userid,userDetail);
        if (a!=0)
            return true;
        else
            return  false;

    }

}
