package com.linjun.controller;

import com.linjun.model.Siglns;
import com.linjun.service.Siglnservice;
import com.sun.javafx.binding.StringFormatter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api("签到管理")
@RequestMapping(value = "/siglns")
@RestController
public class SiglnsController {
@Autowired
    Siglnservice siglnservice;

 @ApiOperation(value = "添加数据",notes = "添加数据",produces = "application/json")
 @PostMapping(value = "/insert")
    public  @ResponseBody int insert(@RequestParam(value = "userID")int userID, @RequestParam(value = "experSum")long experSum,
                                     @RequestParam(value = "tradePoint")long tradePoint, @RequestParam(value ="monthSignCount")String monthSignCount, @RequestParam(value = "lastSiglns")Date lastsiglns){

     Siglns siglns=new Siglns();
     siglns.setUserid(userID);
     siglns.setExpersum(experSum);
     siglns.setMonthsigncount(monthSignCount);
     siglns.setTradepoint(tradePoint);
     siglns.setLastsiglns(lastsiglns);
     return siglnservice.insert(siglns);
 }
   @ApiOperation(value = "更新数据",notes = "根据userid更新数据")
    @PutMapping(value = "/update")
    public  @ResponseBody int update(@RequestParam(value = "userID")int userID, @RequestParam(value = "experSum")long experSum,
                                     @RequestParam(value = "tradePoint")long tradePoint, @RequestParam(value ="monthSignCount")String monthSignCount, @RequestParam(value = "lastSiglns")Date lastsiglns){
        Siglns siglns=new Siglns();
        siglns.setLastsiglns(lastsiglns);
        siglns.setMonthsigncount(monthSignCount);
        siglns.setExpersum(experSum);
        siglns.setTradepoint(tradePoint);
        return siglnservice.update(userID,siglns);

   }
 @ApiOperation(value = "删除数据",notes = "根据userid",produces = "application/json")
    @DeleteMapping(value = "/delete/{userid}")
    public  int delete(@PathVariable int userid){

     return siglnservice.delete(userid);
 }



}
