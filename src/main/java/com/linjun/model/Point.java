package com.linjun.model;

import java.util.Date;

public class Point {
    private Integer id;

    private Integer userid;

    private String description;

    private Date time;

    private Long pointsum;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getPointsum() {
        return pointsum;
    }

    public void setPointsum(Long pointsum) {
        this.pointsum = pointsum;
    }
}