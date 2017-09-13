package com.linjun.controller;

import com.linjun.model.ThirdParty;
import com.linjun.service.ThirdParthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("第三方账户")
@RequestMapping(value = "/thirtdParth")
public class ThirtdParthController {
    @Autowired
    ThirdParthService thirdParthService;
    @ApiOperation(value ="添加数据",notes = "添加第三方数据",produces = "application/json")
    @PostMapping(value = "/insert")
    public @ResponseBody int insert(@RequestParam(value ="userID")int userID,@RequestParam(value = "accountTypeKey")String accountTypeKey,
    @RequestParam(value = "identification") String identification,@RequestParam(value = "accesstoken") String accesstoken){
        ThirdParty thirdParty=new ThirdParty();
        thirdParty.setUserid(userID);
        thirdParty.setAccounttypekey(accountTypeKey);
        thirdParty.setAccesstoken(accesstoken);
        thirdParty.setIdentification(identification);
        return  thirdParthService.inserts(thirdParty);
    }
  @ApiOperation(value = "更新数据",notes ="根据id更新数据",produces = "application/json")
    @PutMapping(value = "/update")
    public @ResponseBody int updates(@RequestParam(value ="userID")int userID,@RequestParam(value = "accountTypeKey")String accountTypeKey,
                                     @RequestParam(value = "identification") String identification,@RequestParam(value = "accesstoken") String accesstoken){
       ThirdParty thirdParty=new ThirdParty();
       thirdParty.setAccounttypekey(accountTypeKey);
       thirdParty.setAccesstoken(accesstoken);
       thirdParty.setIdentification(identification);
       return  thirdParthService.updates(userID,thirdParty);
  }
   @ApiOperation(value = "删除数据",notes = "根据的userID删除数据",produces = "application/json")
    @DeleteMapping(value = "/delete/{userID}")
    public  @ResponseBody  int delete(@PathVariable int userID){

        return thirdParthService.deleteByUserID(userID);
   }

}
