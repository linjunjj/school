package com.linjun.model;

public class ThirdParty {
    private Integer id;

    private Integer userid;

    private String accounttypekey;

    private String identification;

    private String accesstoken;

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

    public String getAccounttypekey() {
        return accounttypekey;
    }

    public void setAccounttypekey(String accounttypekey) {
        this.accounttypekey = accounttypekey == null ? null : accounttypekey.trim();
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification == null ? null : identification.trim();
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken == null ? null : accesstoken.trim();
    }
}