package com.linjun.controller;

import com.linjun.model.Reprot;
import com.linjun.service.ReprotService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api("举报管理")
@RestController
@RequestMapping(value = "/reprot")
public class ReprotController {
    @Autowired
    ReprotService reprotService;
    @ApiOperation(value = "添加数据",notes = "添加数据",produces = "application/json")
    @PostMapping(value = "/insert")
    public @ResponseBody int insert(@RequestParam(value = "userid")int userid,@RequestParam(value = "reason")String reason,
                         @RequestParam(value = "title")String title,@RequestParam(value = "description")String description,
                                    @RequestParam(value = "statul")String statul){
        Reprot reprot=new Reprot();
        reprot.setUserid(userid);
        reprot.setDatacreate(new Date());
        reprot.setDescription(description);
        reprot.setReason(reason);
        reprot.setStatul(statul);
        return reprotService.insert(reprot);
    }
    @ApiOperation(value = "更新数据",notes = "根据userid更新数据",produces = "application/json")
    @PutMapping(value = "/update")
     public @ResponseBody int update(
            @RequestParam(value = "userid")int userid,@RequestParam(value = "reason")String reason,
            @RequestParam(value = "title")String title,@RequestParam(value = "description")String description,
            @RequestParam(value = "statul")String statul
    ){
        Reprot reprot=new Reprot();
        reprot.setDatacreate(new Date());
        reprot.setDescription(description);
        reprot.setReason(reason);
        reprot.setStatul(statul);
        return  reprotService.delete(userid);
    }



}
