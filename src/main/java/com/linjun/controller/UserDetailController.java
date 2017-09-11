package com.linjun.controller;

import com.linjun.model.UserDetail;
import com.linjun.service.UserDetailService;
import com.linjun.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




}
