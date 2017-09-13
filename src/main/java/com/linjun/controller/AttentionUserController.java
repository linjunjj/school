package com.linjun.controller;

import com.linjun.model.AttentionUser;
import com.linjun.service.AttentionUserService;
import com.sun.javafx.binding.StringFormatter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/attentionUser'")
@Api("关注用户")
public class AttentionUserController {
    @Autowired
    AttentionUserService attentionUserService;
    @ApiOperation(value = "增加数据",notes = "添加数据",produces = "application/json")
    @PostMapping("/insert")
    public @ResponseBody int insert(@RequestParam(value = "userID")int userId,@RequestParam(value = "followUserID")int followUserID){
        AttentionUser attentionUser=new AttentionUser();
        attentionUser.setDatacreate(new Date());
        attentionUser.setUserid(userId);
        attentionUser.setFollowuserid(userId);
        return attentionUserService.insert(attentionUser);
    }
    @ApiOperation(value = "更新数据",notes = "更新不为空的数据",produces = "application/json")
    @PutMapping(value = "/update")
    public  @ResponseBody int update(@RequestParam(value = "userID")int userId,@RequestParam(value = "followUserID")int followUserID,@RequestParam(value = "isMutal")int isMutal){
  AttentionUser attentionUser=new AttentionUser();
  attentionUser.setDatacreate(new Date());
  attentionUser.setFollowuserid(followUserID);
  attentionUser.setIsmutal(String.valueOf(isMutal));
   return attentionUserService.updates(userId,attentionUser);
    }
 @ApiOperation(value = "删除数据",notes = "根据UseriID数据",produces = "application/json")
    @DeleteMapping(value = "delete/{userID}")
    public  @ResponseBody int delete(int userID){
      return attentionUserService.delete(userID);
 }


}
