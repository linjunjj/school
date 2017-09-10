package com.linjun.model;

import java.util.Date;

public class Colum {
    private Integer id;

    private String columname;

    private String description;

    private Integer parentid;

    private String parentlist;

    private Integer childcount;

    private Date datacreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColumname() {
        return columname;
    }

    public void setColumname(String columname) {
        this.columname = columname == null ? null : columname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getParentlist() {
        return parentlist;
    }

    public void setParentlist(String parentlist) {
        this.parentlist = parentlist == null ? null : parentlist.trim();
    }

    public Integer getChildcount() {
        return childcount;
    }

    public void setChildcount(Integer childcount) {
        this.childcount = childcount;
    }

    public Date getDatacreate() {
        return datacreate;
    }

    public void setDatacreate(Date datacreate) {
        this.datacreate = datacreate;
    }
}