package com.linjun.controller;

import com.linjun.model.Theme;
import com.linjun.service.ThemeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@Api("主题管理")
@RequestMapping(value = "/theme")
public class ThemeController {
    @Autowired
    ThemeService themeService;
        @ApiOperation(value = "添加数据",produces = "application/json")
    @PostMapping(value = "/insert")
    public @ResponseBody
        int insert (@RequestParam(value = "sectionID")int sectionID, @RequestParam(value = "ownerID")int ownerID,
                    @RequestParam(value = "author")String author, @RequestParam(value = "subject")String subject,
                    @RequestParam(value = "body")String body, @RequestParam(value = "isLocked")String isLocked, @RequestParam(value = "isStiky")String isStiky,
                    @RequestParam(value = "approvalstatul")int approvalstatul, @RequestParam(value = "ip")String ip, @RequestParam(value = "lastMontime")Date lastMontime)
    {
        Theme theme=new Theme();
        theme.setApprovalstatul(approvalstatul);
        theme.setAuthor(author);
        theme.setBody(body);
        theme.setDatacreate(new Date());
        theme.setIslocked(isLocked);
        theme.setIsstiky(isStiky);
        theme.setLastmontime(lastMontime);
        theme.setOwnerid(ownerID);
        theme.setIp(ip);
        theme.setSectionid(sectionID);
        return themeService.insert(theme);
    }
 @ApiOperation(value = "更新数据",notes = "根据id更新数据",produces = "application/json")
    @PutMapping(value = "/update")
    public  @ResponseBody int update(@RequestParam(value = "sectionID")int sectionID, @RequestParam(value = "ownerID")int ownerID,
                                     @RequestParam(value = "author")String author, @RequestParam(value = "subject")String subject,
                                     @RequestParam(value = "body")String body, @RequestParam(value = "isLocked")String isLocked, @RequestParam(value = "isStiky")String isStiky,
                                     @RequestParam(value = "approvalstatul")int approvalstatul, @RequestParam(value = "ip")String ip, @RequestParam(value = "lastMontime")Date lastMontime){
     Theme theme=new Theme();
     theme.setApprovalstatul(approvalstatul);
     theme.setAuthor(author);
     theme.setBody(body);
     theme.setDatacreate(new Date());
     theme.setIslocked(isLocked);
     theme.setIsstiky(isStiky);
     theme.setLastmontime(lastMontime);
     theme.setOwnerid(ownerID);
     theme.setIp(ip);
return  themeService.update(sectionID,theme);
 }
@ApiOperation(value = "删除数据",notes = "删除数据",produces = "application/json")
    @DeleteMapping("/delete/{sectionID}")
    public int delete(@PathVariable int sectionID){
        return themeService.delete(sectionID);
}


}
