package com.linjun.controller;

import com.linjun.model.Admin;
import com.linjun.service.AdminService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping(value ="/admin")
public class AdminController {
     @Autowired
    AdminService adminService;
    @ApiOperation(value = "获取所有系统管理员列表",notes = "", produces = "application/json")
    @GetMapping(value = "/findAll")
    public List<Admin> getAdminList() {
        return adminService.findAll();
    }
    @ApiOperation(value = "创建管理员",notes = "根据Admin对象创建对象", produces = "application/json")
    @PostMapping(value = "/buildAdmin")
    public int postUser(String adminaccount,String adminPassword) throws Exception {
           Admin admin=new Admin();
           admin.setAdminaccount(adminaccount);
           admin.setAdminpassword(adminPassword);
           admin.setIp(String.valueOf(getLocalHostLANAddress()));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          admin.setBuildtime(new Date());
        return adminService.inserts(admin);
    }
    @ApiOperation(value="获取管理详细信息", notes="根据url的id来获取管理员详细信息",produces = "application/json")
    @GetMapping(value = "/{id}")
    public Admin getUser(@PathVariable Integer id) {
        return adminService.findByKey(id);
    }
    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的admin信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "管理员ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "admin", value = "管理员详细实体admin", required = true, dataType = "User")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Integer id, @RequestBody Admin admin) {
            adminService.updateAdmin(id,admin);
        return "success";
    }
    @ApiOperation(value="删除管理员", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "管理ID", required = true, paramType = "path",dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id) {
          int a= adminService.deletesBykey(id);
          if (a!=0)
        return "success";
          else
              return "fail";
    }
    @ApiOperation(value ="查找管理员",notes = "根据管理员用户名查找对象")
    @ApiImplicitParam(name = "adminaccount",value = "管理员账户",required = true,paramType = "path",dataType = "String")
    @RequestMapping(value ="/{account}",method = RequestMethod.GET)
    public boolean isAdmin(@PathVariable String adminaccount){
       if (adminService.findByName(adminaccount)!=null){
           return true;
       }
        return false;
    }

    //获取本机ip地址
    public InetAddress getLocalHostLANAddress() throws Exception {
        try {
            InetAddress candidateAddress = null;
            // 遍历所有的网络接口
            for (Enumeration ifaces = NetworkInterface.getNetworkInterfaces(); ifaces.hasMoreElements(); ) {
                NetworkInterface iface = (NetworkInterface) ifaces.nextElement();
                // 在所有的接口下再遍历IP
                for (Enumeration inetAddrs = iface.getInetAddresses(); inetAddrs.hasMoreElements(); ) {
                    InetAddress inetAddr = (InetAddress) inetAddrs.nextElement();
                    if (!inetAddr.isLoopbackAddress()) {// 排除loopback类型地址
                        if (inetAddr.isSiteLocalAddress()) {
                            // 如果是site-local地址，就是它了
                            return inetAddr;
                        } else if (candidateAddress == null) {
                            // site-local类型的地址未被发现，先记录候选地址
                            candidateAddress = inetAddr;
                        }
                    }
                }
            }
            if (candidateAddress != null) {
                return candidateAddress;
            }
            // 如果没有发现 non-loopback地址.只能用最次选的方案
            InetAddress jdkSuppliedAddress = InetAddress.getLocalHost();
            return jdkSuppliedAddress;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
