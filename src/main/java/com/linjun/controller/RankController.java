package com.linjun.controller;

import com.linjun.model.Rank;
import com.linjun.service.RankService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "用户等级管理")
@RequestMapping(value = "/rank")
public class RankController {
    @Autowired
    RankService rankService;
    @ApiOperation(value = "添加数据",notes = "添加数据",produces = "application/json")
    @PostMapping(value = "/insert")
    public @ResponseBody int insert(@RequestParam(value = "pointLower")long pointLower,@RequestParam(value = "rank") long rank,
            @RequestParam(value = "userID")int userID,@RequestParam(value = "rankName")String rankName
    ){
        Rank rank1=new Rank();
        rank1.setPointlower(pointLower);
        rank1.setRank(rank);
        rank1.setRankname(rankName);
        rank1.setUserid(userID);
        return rankService.insert(rank1);
    }
  @ApiOperation(value = "更新数据",notes = "根据userid更新数据",produces = "application/json")
    @PutMapping(value = "/update")
    public @ResponseBody int update(@RequestParam(value = "rank") long rank,
                                    @RequestParam(value = "userID")int userID,@RequestParam(value = "rankName")String rankName){
        Rank r=new Rank();
        r.setRankname(rankName);
        r.setRank(rank);
      return rankService.update(userID,r);
  }
  @ApiOperation(value = "删除数据",notes = "根据userid删除数据",produces = "application/json")
    @DeleteMapping("/delete/{userid}")
    public int delete(@PathVariable int userid){
        return rankService.delete(userid);
  }

}
