package com.linjun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThemeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThemeCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNull() {
            addCriterion("sectionID is null");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNotNull() {
            addCriterion("sectionID is not null");
            return (Criteria) this;
        }

        public Criteria andSectionidEqualTo(Integer value) {
            addCriterion("sectionID =", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotEqualTo(Integer value) {
            addCriterion("sectionID <>", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThan(Integer value) {
            addCriterion("sectionID >", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sectionID >=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThan(Integer value) {
            addCriterion("sectionID <", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThanOrEqualTo(Integer value) {
            addCriterion("sectionID <=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidIn(List<Integer> values) {
            addCriterion("sectionID in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotIn(List<Integer> values) {
            addCriterion("sectionID not in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidBetween(Integer value1, Integer value2) {
            addCriterion("sectionID between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("sectionID not between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("ownerID is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("ownerID is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Integer value) {
            addCriterion("ownerID =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Integer value) {
            addCriterion("ownerID <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Integer value) {
            addCriterion("ownerID >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ownerID >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Integer value) {
            addCriterion("ownerID <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Integer value) {
            addCriterion("ownerID <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Integer> values) {
            addCriterion("ownerID in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Integer> values) {
            addCriterion("ownerID not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Integer value1, Integer value2) {
            addCriterion("ownerID between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Integer value1, Integer value2) {
            addCriterion("ownerID not between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andBodyIsNull() {
            addCriterion("body is null");
            return (Criteria) this;
        }

        public Criteria andBodyIsNotNull() {
            addCriterion("body is not null");
            return (Criteria) this;
        }

        public Criteria andBodyEqualTo(String value) {
            addCriterion("body =", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotEqualTo(String value) {
            addCriterion("body <>", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThan(String value) {
            addCriterion("body >", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThanOrEqualTo(String value) {
            addCriterion("body >=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThan(String value) {
            addCriterion("body <", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThanOrEqualTo(String value) {
            addCriterion("body <=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLike(String value) {
            addCriterion("body like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotLike(String value) {
            addCriterion("body not like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyIn(List<String> values) {
            addCriterion("body in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotIn(List<String> values) {
            addCriterion("body not in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyBetween(String value1, String value2) {
            addCriterion("body between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotBetween(String value1, String value2) {
            addCriterion("body not between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNull() {
            addCriterion("isLocked is null");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNotNull() {
            addCriterion("isLocked is not null");
            return (Criteria) this;
        }

        public Criteria andIslockedEqualTo(String value) {
            addCriterion("isLocked =", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotEqualTo(String value) {
            addCriterion("isLocked <>", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThan(String value) {
            addCriterion("isLocked >", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThanOrEqualTo(String value) {
            addCriterion("isLocked >=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThan(String value) {
            addCriterion("isLocked <", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThanOrEqualTo(String value) {
            addCriterion("isLocked <=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLike(String value) {
            addCriterion("isLocked like", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotLike(String value) {
            addCriterion("isLocked not like", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedIn(List<String> values) {
            addCriterion("isLocked in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotIn(List<String> values) {
            addCriterion("isLocked not in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedBetween(String value1, String value2) {
            addCriterion("isLocked between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotBetween(String value1, String value2) {
            addCriterion("isLocked not between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andIsstikyIsNull() {
            addCriterion("isStiky is null");
            return (Criteria) this;
        }

        public Criteria andIsstikyIsNotNull() {
            addCriterion("isStiky is not null");
            return (Criteria) this;
        }

        public Criteria andIsstikyEqualTo(String value) {
            addCriterion("isStiky =", value, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyNotEqualTo(String value) {
            addCriterion("isStiky <>", value, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyGreaterThan(String value) {
            addCriterion("isStiky >", value, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyGreaterThanOrEqualTo(String value) {
            addCriterion("isStiky >=", value, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyLessThan(String value) {
            addCriterion("isStiky <", value, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyLessThanOrEqualTo(String value) {
            addCriterion("isStiky <=", value, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyLike(String value) {
            addCriterion("isStiky like", value, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyNotLike(String value) {
            addCriterion("isStiky not like", value, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyIn(List<String> values) {
            addCriterion("isStiky in", values, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyNotIn(List<String> values) {
            addCriterion("isStiky not in", values, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyBetween(String value1, String value2) {
            addCriterion("isStiky between", value1, value2, "isstiky");
            return (Criteria) this;
        }

        public Criteria andIsstikyNotBetween(String value1, String value2) {
            addCriterion("isStiky not between", value1, value2, "isstiky");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulIsNull() {
            addCriterion("approvalstatul is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulIsNotNull() {
            addCriterion("approvalstatul is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulEqualTo(Integer value) {
            addCriterion("approvalstatul =", value, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulNotEqualTo(Integer value) {
            addCriterion("approvalstatul <>", value, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulGreaterThan(Integer value) {
            addCriterion("approvalstatul >", value, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulGreaterThanOrEqualTo(Integer value) {
            addCriterion("approvalstatul >=", value, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulLessThan(Integer value) {
            addCriterion("approvalstatul <", value, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulLessThanOrEqualTo(Integer value) {
            addCriterion("approvalstatul <=", value, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulIn(List<Integer> values) {
            addCriterion("approvalstatul in", values, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulNotIn(List<Integer> values) {
            addCriterion("approvalstatul not in", values, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulBetween(Integer value1, Integer value2) {
            addCriterion("approvalstatul between", value1, value2, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andApprovalstatulNotBetween(Integer value1, Integer value2) {
            addCriterion("approvalstatul not between", value1, value2, "approvalstatul");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andDatacreateIsNull() {
            addCriterion("dataCreate is null");
            return (Criteria) this;
        }

        public Criteria andDatacreateIsNotNull() {
            addCriterion("dataCreate is not null");
            return (Criteria) this;
        }

        public Criteria andDatacreateEqualTo(Date value) {
            addCriterion("dataCreate =", value, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateNotEqualTo(Date value) {
            addCriterion("dataCreate <>", value, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateGreaterThan(Date value) {
            addCriterion("dataCreate >", value, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateGreaterThanOrEqualTo(Date value) {
            addCriterion("dataCreate >=", value, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateLessThan(Date value) {
            addCriterion("dataCreate <", value, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateLessThanOrEqualTo(Date value) {
            addCriterion("dataCreate <=", value, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateIn(List<Date> values) {
            addCriterion("dataCreate in", values, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateNotIn(List<Date> values) {
            addCriterion("dataCreate not in", values, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateBetween(Date value1, Date value2) {
            addCriterion("dataCreate between", value1, value2, "datacreate");
            return (Criteria) this;
        }

        public Criteria andDatacreateNotBetween(Date value1, Date value2) {
            addCriterion("dataCreate not between", value1, value2, "datacreate");
            return (Criteria) this;
        }

        public Criteria andLastmontimeIsNull() {
            addCriterion("lastMontime is null");
            return (Criteria) this;
        }

        public Criteria andLastmontimeIsNotNull() {
            addCriterion("lastMontime is not null");
            return (Criteria) this;
        }

        public Criteria andLastmontimeEqualTo(Date value) {
            addCriterion("lastMontime =", value, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeNotEqualTo(Date value) {
            addCriterion("lastMontime <>", value, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeGreaterThan(Date value) {
            addCriterion("lastMontime >", value, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastMontime >=", value, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeLessThan(Date value) {
            addCriterion("lastMontime <", value, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeLessThanOrEqualTo(Date value) {
            addCriterion("lastMontime <=", value, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeIn(List<Date> values) {
            addCriterion("lastMontime in", values, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeNotIn(List<Date> values) {
            addCriterion("lastMontime not in", values, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeBetween(Date value1, Date value2) {
            addCriterion("lastMontime between", value1, value2, "lastmontime");
            return (Criteria) this;
        }

        public Criteria andLastmontimeNotBetween(Date value1, Date value2) {
            addCriterion("lastMontime not between", value1, value2, "lastmontime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}