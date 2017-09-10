package com.linjun.model;

import java.util.Date;

public class Categroy {
    private Integer id;

    private Integer parentid;

    private Integer ownerid;

    private String categroyname;

    private String description;

    private Integer displayolder;

    private Integer childcount;

    private Date lastmodifed;

    private Date datacreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public String getCategroyname() {
        return categroyname;
    }

    public void setCategroyname(String categroyname) {
        this.categroyname = categroyname == null ? null : categroyname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDisplayolder() {
        return displayolder;
    }

    public void setDisplayolder(Integer displayolder) {
        this.displayolder = displayolder;
    }

    public Integer getChildcount() {
        return childcount;
    }

    public void setChildcount(Integer childcount) {
        this.childcount = childcount;
    }

    public Date getLastmodifed() {
        return lastmodifed;
    }

    public void setLastmodifed(Date lastmodifed) {
        this.lastmodifed = lastmodifed;
    }

    public Date getDatacreate() {
        return datacreate;
    }

    public void setDatacreate(Date datacreate) {
        this.datacreate = datacreate;
    }
}