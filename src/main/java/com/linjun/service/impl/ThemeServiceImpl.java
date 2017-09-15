package com.linjun.service.impl;

import com.linjun.dao.ThemeMapper;
import com.linjun.model.Theme;
import com.linjun.model.ThemeCriteria;
import com.linjun.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;

@Service
public class ThemeServiceImpl implements ThemeService{
    @Autowired
    ThemeMapper themeMapper;

    public int insert(Theme theme) {
        return themeMapper.insert(theme);
    }

    public int update(int id, Theme theme) {
        ThemeCriteria themeCriteria=new ThemeCriteria();
        ThemeCriteria.Criteria criteria=themeCriteria.createCriteria();
        criteria.andIdEqualTo(id);
        return themeMapper.updateByExample(theme,themeCriteria);
    }

    public int delete(int id) {
        return themeMapper.deleteByPrimaryKey(id);
    }
//    @ApiOperation(value = "添加数据",produces = "application/json")
//    @PostMapping(value = "/insert")
//    public @ResponseBody int insert (@RequestParam(value = "sectionID")int sectionID, @RequestParam(value = "ownerID")int ownerID,
//                                     @RequestParam(value = "author")String author, @RequestParam(value = "subject")String subject,
//                                     @RequestParam(value = "body")String body, @RequestParam(value = "isLocked")String isLocked, @RequestParam(value = "isStiky")String isStiky,
//                                     @RequestParam(value = "approvalstatul")int approvalstatul, @RequestParam(value = "ip")String ip, @RequestParam(value = "lastMontime")Date lastMontime)
//    {
//        Theme theme=new Theme();
//        theme.setApprovalstatul(approvalstatul);
//        theme.setAuthor(author);
//        theme.setBody(body);
//        theme.setDatacreate(new Date());
//        theme.setIslocked(isLocked);
//        theme.setIsstiky(isStiky);
//        theme.setLastmontime(lastMontime);
//        theme.setOwnerid(ownerID);
//        theme.setIp(ip);
//        theme.setSectionid(sectionID);
//        return te
//    }


}
