package com.linjun.controller;


import com.linjun.model.Attitude;
import com.linjun.service.AttitudeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/attitude")
@Api(value = "点赞管理")
public class AttitudeController {
    @Autowired
    AttitudeService attitudeService;
    @ApiOperation(value = "添加点赞数据",notes = "点赞数据添加",produces = "application/json")
    @PostMapping(value = "/insert")
    public  @ResponseBody int insert(@RequestParam(value ="objectID")int objectID,@RequestParam(value ="userID")int userID){
        Attitude attitude=new Attitude();
        attitude.setObjectid(objectID);
        attitude.setUserid(userID);
        return  attitudeService.insert(attitude);
    }
   @ApiOperation(value = "删除记录",notes = "根据userid删除数据",produces = "application/json")
    @DeleteMapping(value = "/delete/{userID}")
    public int delete(@PathVariable int userID){
       return attitudeService.delete(userID);
   }
}
