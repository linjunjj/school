package com.linjun.model;

import java.util.Date;

public class Siglns {
    private Integer id;

    private Integer userid;

    private Long expersum;

    private Long tradepoint;

    private Integer monthsigncount;

    private Date lastsiglns;

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

    public Long getExpersum() {
        return expersum;
    }

    public void setExpersum(Long expersum) {
        this.expersum = expersum;
    }

    public Long getTradepoint() {
        return tradepoint;
    }

    public void setTradepoint(Long tradepoint) {
        this.tradepoint = tradepoint;
    }

    public Integer getMonthsigncount() {
        return monthsigncount;
    }

    public void setMonthsigncount(String monthsigncount) {
        this.monthsigncount = monthsigncount;
    }

    public Date getLastsiglns() {
        return lastsiglns;
    }

    public void setLastsiglns(Date lastsiglns) {
        this.lastsiglns = lastsiglns;
    }
}