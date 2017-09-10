package com.linjun.controller;

import com.linjun.model.Admin;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value ="/admin")
public class AdminController {
    static Map<Integer,Admin> adminMap= Collections.synchronizedMap(new HashMap<Integer, Admin>());
    @ApiOperation(value = "获取所有系统管理员列表",notes = "")
    public List<Admin> getUserList() {
        List<Admin> r = new ArrayList<Admin>(adminMap.values());
        return r;
    }
    @ApiOperation(value = "创建管理员",notes = "根据Admin对象创建对象")
    @ApiImplicitParam(name = "admin", value = "用户详细实体user", required = true, dataType = "Admin")
    @RequestMapping(value="", method= RequestMethod.POST)
    public String postUser(@RequestBody Admin admin) {
        adminMap.put(admin.getId(), admin);
        return "success";
    }
    @ApiOperation(value="获取管理详细信息", notes="根据url的id来获取管理员详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType="path",dataType = "Integer")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Admin getUser(@PathVariable Integer id) {
        return adminMap.get(id);
    }
    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的admin信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "管理员ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "admin", value = "管理员详细实体admin", required = true, dataType = "User")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Integer id, @RequestBody Admin admin) {
        Admin a = adminMap.get(id);
        a.setAdminaccount(admin.getAdminaccount());
        a.setAdminpassword(admin.getAdminaccount());
        a.setBuildtime(new Date());
        adminMap.put(id, a);
        return "success";
    }
    @ApiOperation(value="删除管理员", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "管理ID", required = true, paramType = "path",dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id) {
           adminMap.remove(id);
        return "success";
    }

}
