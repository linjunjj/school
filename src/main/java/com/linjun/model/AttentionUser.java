package com.linjun.model;

import java.util.Date;

public class AttentionUser {
    private Integer id;

    private Integer userid;

    private Integer followuserid;

    private String ismutal;

    private Date datacreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFollowuserid() {
        return followuserid;
    }

    public void setFollowuserid(Integer followuserid) {
        this.followuserid = followuserid;
    }

    public String getIsmutal() {
        return ismutal;
    }

    public void setIsmutal(String ismutal) {
        this.ismutal = ismutal == null ? null : ismutal.trim();
    }

    public Date getDatacreate() {
        return datacreate;
    }

    public void setDatacreate(Date datacreate) {
        this.datacreate = datacreate;
    }
}