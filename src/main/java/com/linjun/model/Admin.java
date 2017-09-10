package com.linjun.model;

import java.util.Date;

public class Admin {
    private Integer id;

    private String ip;

    private Date buildtime;

    private Date signintime;

    private Date signouttime;

    private Date sigtime;

    private String adminaccount;

    private String adminpassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }

    public Date getSignintime() {
        return signintime;
    }

    public void setSignintime(Date signintime) {
        this.signintime = signintime;
    }

    public Date getSignouttime() {
        return signouttime;
    }

    public void setSignouttime(Date signouttime) {
        this.signouttime = signouttime;
    }

    public Date getSigtime() {
        return sigtime;
    }

    public void setSigtime(Date sigtime) {
        this.sigtime = sigtime;
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount == null ? null : adminaccount.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }
}