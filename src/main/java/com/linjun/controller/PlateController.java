package com.linjun.controller;

import com.linjun.model.Plate;
import com.linjun.service.PlateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/plate")
@Api("板块管理")
public class PlateController {
    @Autowired
    PlateService plateService;
    @ApiOperation(value = "添加数据",notes = "",produces = "application/json")
    @PostMapping(value = "/insert")
    public @ResponseBody int insert(@RequestParam(value = "ownerID")int ownerID,@RequestParam(value = "name")String name,
               @RequestParam(value = "description")String description,@RequestParam(value = "featuredmageattachid")long featuredmageattachid,
                  @RequestParam(value = "isEnable")String isEnable,@RequestParam(value = "display")long display){
        Plate plate=new Plate();
        plate.setOwnerid(ownerID);
        plate.setDatacreate(new Date());
        plate.setDescription(description);
        plate.setDisplayolder(display);
        plate.setFeaturedmageattachid(featuredmageattachid);
        plate.setIsenable(isEnable);
        return plateService.insert(plate);
    }
    @ApiOperation(value = "添加数据",notes = "根据id添加数据",produces = "application/json")
    @PutMapping(value = "/update")
    public  @ResponseBody int update(@RequestParam(value = "ownerID")int ownerID,@RequestParam(value = "name")String name,
                                     @RequestParam(value = "description")String description,@RequestParam(value = "featuredmageattachid")long featuredmageattachid,
                                     @RequestParam(value = "isEnable")String isEnable,@RequestParam(value = "display")long display,@RequestParam(value = "id")int id)
    {
        Plate plate=new Plate();
        plate.setOwnerid(ownerID);
        plate.setDatacreate(new Date());
        plate.setDescription(description);
        plate.setDisplayolder(display);
        plate.setFeaturedmageattachid(featuredmageattachid);
        plate.setIsenable(isEnable);
        return plateService.update(id,plate);

    }
    @ApiOperation(value = "删除数据")
    @DeleteMapping(value = "/delete/{id}")
    public  int delate(@PathVariable int id){
        return plateService.delete(id);
    }

}
