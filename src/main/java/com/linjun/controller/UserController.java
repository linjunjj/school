package com.linjun.controller;

import com.linjun.model.User;
import com.linjun.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/user")
@Api(value = "用户测试")
public class UserController {
    @Autowired
    UserService userService;
    @ApiOperation(value = "获取所有用户列表",notes = "", produces = "application/json")
    @GetMapping(value = "/findAll")
    public List<User> getAdminList() {
        return userService.findAll();
    }
    @ApiOperation(value = "创建用户",notes = "根据User对象创建对象", produces = "application/json")
   @PostMapping(value = "/buildUser")
    public @ResponseBody int postUser(@RequestParam(value = "userName") String userName,@RequestParam(value = "userTel") String userTel,@RequestParam(value = "userMail")String userMail,@RequestParam(value = "userPassword") String userPassword) {
          User user=new User();
        user.setUsername(userName);
        user.setUsrtel(userTel);
        user.setUsermail(userMail);
        user.setUserpassword(userPassword);
        return userService.inserts(user) ;
    }
    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象", produces = "application/json")
    @DeleteMapping(value = "delete/{id}")
    public int deleteUser(@PathVariable Integer id) {
      return userService.deleteByKey(id);}

    @ApiOperation(value = "查找用户",notes = "根据用户名查找用户", produces = "application/json")
    @GetMapping(value = "findUser/{username}")
    public  boolean findUser(@PathVariable String username){
        if (userService.findByUserName(username)!=null){
            return true;
        }
       return false;
    }


}
