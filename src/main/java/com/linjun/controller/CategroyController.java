package com.linjun.controller;

import com.linjun.model.Categroy;
import com.linjun.service.CategroyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.omg.CORBA.DATA_CONVERSION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api("分类管理")
@RestController
@RequestMapping(value = "/categroy")
public class CategroyController {
    @Autowired
    CategroyService categroyService;
    @ApiOperation(value = "添加数据",notes = "添加数据",produces = "application/json")
    @PostMapping(value = "/insert")
    public  @ResponseBody int insert(@RequestParam(value = "parentID")int parentID, @RequestParam(value = "ownerID")int ownerID,
                                     @RequestParam(value = "categroyName")String categroyName, @RequestParam(value = "description")String description,@RequestParam(value = "displayOlder")int displayOlder,
                                     @RequestParam(value = "childCount")int childCount, @RequestParam(value = "lastMondifed")Date lastMondifed){

        Categroy categroy=new Categroy();
        categroy.setCategroyname(categroyName);
        categroy.setChildcount(childCount);
        categroy.setDescription(description);
        categroy.setDatacreate(new Date());
        categroy.setLastmodifed(lastMondifed);
        categroy.setOwnerid(ownerID);
        categroy.setParentid(parentID);
        categroy.setDisplayolder(displayOlder);
        return categroyService.insert(categroy);
    }
  @ApiOperation(value = "/update")
    @PutMapping(value = "/update")
    public  @ResponseBody int update(@RequestParam(value = "id")int id,@RequestParam(value = "parentID")int parentID, @RequestParam(value = "ownerID")int ownerID,
                                     @RequestParam(value = "categroyName")String categroyName, @RequestParam(value = "description")String description,@RequestParam(value = "displayOlder")int displayOlder,
                                     @RequestParam(value = "childCount")int childCount, @RequestParam(value = "lastMondifed")Date lastMondifed){
      Categroy categroy=new Categroy();
      categroy.setCategroyname(categroyName);
      categroy.setChildcount(childCount);
      categroy.setDescription(description);
      categroy.setDatacreate(new Date());
      categroy.setLastmodifed(lastMondifed);
      categroy.setOwnerid(ownerID);
      categroy.setParentid(parentID);
      categroy.setDisplayolder(displayOlder);
      return  categroyService.update(id,categroy);
  }

  @ApiOperation(value = "删除数据",produces = "application/json")
    @DeleteMapping(value = "/delete/{id}")
    public  int delete(@PathVariable int id){
      return categroyService.delete(id);
  }

}
