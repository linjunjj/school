package com.linjun.model;

import java.util.Date;

public class Contentltem {
    private Integer id;

    private Integer contentcategroyid;

    private Integer contentmodelid;

    private String subject;

    private String body;

    private Long featuredmageattachid;

    private Integer userid;

    private String author;

    private String summary;

    private String ip;

    private Date datepuished;

    private Date datacreate;

    private Date lastmodifed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentcategroyid() {
        return contentcategroyid;
    }

    public void setContentcategroyid(Integer contentcategroyid) {
        this.contentcategroyid = contentcategroyid;
    }

    public Integer getContentmodelid() {
        return contentmodelid;
    }

    public void setContentmodelid(Integer contentmodelid) {
        this.contentmodelid = contentmodelid;
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

    public Long getFeaturedmageattachid() {
        return featuredmageattachid;
    }

    public void setFeaturedmageattachid(Long featuredmageattachid) {
        this.featuredmageattachid = featuredmageattachid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getDatepuished() {
        return datepuished;
    }

    public void setDatepuished(Date datepuished) {
        this.datepuished = datepuished;
    }

    public Date getDatacreate() {
        return datacreate;
    }

    public void setDatacreate(Date datacreate) {
        this.datacreate = datacreate;
    }

    public Date getLastmodifed() {
        return lastmodifed;
    }

    public void setLastmodifed(Date lastmodifed) {
        this.lastmodifed = lastmodifed;
    }
}