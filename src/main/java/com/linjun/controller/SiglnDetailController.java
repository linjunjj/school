package com.linjun.controller;

import com.linjun.model.SiglnsDetail;
import com.linjun.service.SiglnDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@Api("签到细节管理")
@RequestMapping(value = "/siglnDetail")
public class SiglnDetailController {
    @Autowired
    SiglnDetailService siglnDetailService;
    @ApiOperation(value = "添加数据",notes = "添加数据",produces = "application/json")
    @PostMapping(value = "/insert")
    public  @ResponseBody int insert(@RequestParam(value ="userid")int userid,@RequestParam(value = "expencePiont")int expencePiont,
                               @RequestParam(value = "tradePiont")int tradePiont){
        SiglnsDetail siglnsDetail=new SiglnsDetail();
        siglnsDetail.setUserid(userid);
        siglnsDetail.setDatacreate(new Date());
        siglnsDetail.setExpencepiont(expencePiont);
        siglnsDetail.setTradepoint(tradePiont);
        return siglnDetailService.insert(siglnsDetail);
    }
  @ApiOperation(value = "更新数据",notes = "更新数据",produces = "application/json")
    @PutMapping(value = "/update")
    public  @ResponseBody int updade(@RequestParam(value ="userid")int userid,@RequestParam(value = "expencePiont")int expencePiont,
                                     @RequestParam(value = "tradePiont")int tradePiont){
        SiglnsDetail siglnsDetail=new SiglnsDetail();
        siglnsDetail.setTradepoint(tradePiont);
        siglnsDetail.setExpencepiont(expencePiont);
        siglnsDetail.setDatacreate(new Date());
        return siglnDetailService.update(userid,siglnsDetail);
  }
  @ApiOperation(value = "删除数据",notes = "删除数据",produces = "application/json")
    @DeleteMapping(value = "delete/{userid}")
    public  int delete(@PathVariable int userid){
        return siglnDetailService.delete(userid);
  }

}
