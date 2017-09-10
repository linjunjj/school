package com.linjun.model;

import java.util.Date;

public class Comment {
    private Integer id;

    private String commenttype;

    private Integer parentid;

    private Integer commentobjectid;

    private Integer ownerid;

    private Integer userid;

    private String author;

    private String subject;

    private String body;

    private String isprivate;

    private String ip;

    private Date datacreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommenttype() {
        return commenttype;
    }

    public void setCommenttype(String commenttype) {
        this.commenttype = commenttype == null ? null : commenttype.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getCommentobjectid() {
        return commentobjectid;
    }

    public void setCommentobjectid(Integer commentobjectid) {
        this.commentobjectid = commentobjectid;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
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

    public String getIsprivate() {
        return isprivate;
    }

    public void setIsprivate(String isprivate) {
        this.isprivate = isprivate == null ? null : isprivate.trim();
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
}