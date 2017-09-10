package com.linjun.model;

public class Rank {
    private Integer id;

    private Long pointlower;

    private Long rank;

    private Integer userid;

    private String rankname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPointlower() {
        return pointlower;
    }

    public void setPointlower(Long pointlower) {
        this.pointlower = pointlower;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRankname() {
        return rankname;
    }

    public void setRankname(String rankname) {
        this.rankname = rankname == null ? null : rankname.trim();
    }
}