package com.linjun.model;

import java.util.Date;

public class Theme {
    private Integer id;

    private Integer sectionid;

    private Integer ownerid;

    private String author;

    private String subject;

    private String body;

    private String islocked;

    private String isstiky;

    private Integer approvalstatul;

    private String ip;

    private Date datacreate;

    private Date lastmontime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getIslocked() {
        return islocked;
    }

    public void setIslocked(String islocked) {
        this.islocked = islocked == null ? null : islocked.trim();
    }

    public String getIsstiky() {
        return isstiky;
    }

    public void setIsstiky(String isstiky) {
        this.isstiky = isstiky == null ? null : isstiky.trim();
    }

    public Integer getApprovalstatul() {
        return approvalstatul;
    }

    public void setApprovalstatul(Integer approvalstatul) {
        this.approvalstatul = approvalstatul;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getDatacreate() {
        return datacreate;
    }

    public void setDatacreate(Date datacreate) {
        this.datacreate = datacreate;
    }

    public Date getLastmontime() {
        return lastmontime;
    }

    public void setLastmontime(Date lastmontime) {
        this.lastmontime = lastmontime;
    }
}