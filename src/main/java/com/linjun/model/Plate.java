package com.linjun.model;

import java.util.Date;

public class Plate {
    private Integer id;

    private Integer ownerid;

    private String name;

    private String description;

    private Long featuredmageattachid;

    private String isenable;

    private Long displayolder;

    private Date datacreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getFeaturedmageattachid() {
        return featuredmageattachid;
    }

    public void setFeaturedmageattachid(Long featuredmageattachid) {
        this.featuredmageattachid = featuredmageattachid;
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable == null ? null : isenable.trim();
    }

    public Long getDisplayolder() {
        return displayolder;
    }

    public void setDisplayolder(Long displayolder) {
        this.displayolder = displayolder;
    }

    public Date getDatacreate() {
        return datacreate;
    }

    public void setDatacreate(Date datacreate) {
        this.datacreate = datacreate;
    }
}