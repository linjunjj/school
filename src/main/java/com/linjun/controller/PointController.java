package com.linjun.controller;

import com.linjun.model.Point;
import com.linjun.service.PointService;
import com.sun.tools.corba.se.idl.StringGen;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(value = "积分管理")
@RestController
@RequestMapping(value = "/point")
public class PointController {
    @Autowired
    PointService pointService;
@ApiOperation(value = "添加数据",notes = "添加数据",produces = "application/json")
  @PostMapping(value = "/insert")
 public @ResponseBody int insert(@RequestParam(value = "userID")int userID,@RequestParam(value = "description")String description,
                                 @RequestParam(value = "pointSum")long pointSum
                                 ){
    Point point=new Point();
    point.setUserid(userID);
    point.setDescription(description);
    point.setPointsum(pointSum);
    point.setTime(new Date());
    return pointService.insert(point);
}
  @ApiOperation(value = "更新数据",notes = "根据userid更新数据",produces = "application/json")
    @PutMapping(value = "/update")
    public  @ResponseBody int update(
          @RequestParam(value = "userID")int userID,@RequestParam(value = "description")String description,
          @RequestParam(value = "pointSum")long pointSum){
     Point point=new Point();
      point.setTime(new Date());
      point.setPointsum(pointSum);
      point.setDescription(description);
      return pointService.update(userID,point);
  }
  @ApiOperation(value = "删除数据",notes = "根据userid删除数据",produces = "application/json")
    @DeleteMapping(value = "/delete/{userid}")
    public int delete(@PathVariable int userid){
        return pointService.delete(userid);
  }


}
