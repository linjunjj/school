package com.linjun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentltemCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentltemCriteria() {
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

        public Criteria andContentcategroyidIsNull() {
            addCriterion("contentCategroyID is null");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidIsNotNull() {
            addCriterion("contentCategroyID is not null");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidEqualTo(Integer value) {
            addCriterion("contentCategroyID =", value, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidNotEqualTo(Integer value) {
            addCriterion("contentCategroyID <>", value, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidGreaterThan(Integer value) {
            addCriterion("contentCategroyID >", value, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contentCategroyID >=", value, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidLessThan(Integer value) {
            addCriterion("contentCategroyID <", value, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidLessThanOrEqualTo(Integer value) {
            addCriterion("contentCategroyID <=", value, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidIn(List<Integer> values) {
            addCriterion("contentCategroyID in", values, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidNotIn(List<Integer> values) {
            addCriterion("contentCategroyID not in", values, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidBetween(Integer value1, Integer value2) {
            addCriterion("contentCategroyID between", value1, value2, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentcategroyidNotBetween(Integer value1, Integer value2) {
            addCriterion("contentCategroyID not between", value1, value2, "contentcategroyid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidIsNull() {
            addCriterion("contentModelID is null");
            return (Criteria) this;
        }

        public Criteria andContentmodelidIsNotNull() {
            addCriterion("contentModelID is not null");
            return (Criteria) this;
        }

        public Criteria andContentmodelidEqualTo(Integer value) {
            addCriterion("contentModelID =", value, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidNotEqualTo(Integer value) {
            addCriterion("contentModelID <>", value, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidGreaterThan(Integer value) {
            addCriterion("contentModelID >", value, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contentModelID >=", value, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidLessThan(Integer value) {
            addCriterion("contentModelID <", value, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidLessThanOrEqualTo(Integer value) {
            addCriterion("contentModelID <=", value, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidIn(List<Integer> values) {
            addCriterion("contentModelID in", values, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidNotIn(List<Integer> values) {
            addCriterion("contentModelID not in", values, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidBetween(Integer value1, Integer value2) {
            addCriterion("contentModelID between", value1, value2, "contentmodelid");
            return (Criteria) this;
        }

        public Criteria andContentmodelidNotBetween(Integer value1, Integer value2) {
            addCriterion("contentModelID not between", value1, value2, "contentmodelid");
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

        public Criteria andFeaturedmageattachidIsNull() {
            addCriterion("featuredmageattachId is null");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidIsNotNull() {
            addCriterion("featuredmageattachId is not null");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidEqualTo(Long value) {
            addCriterion("featuredmageattachId =", value, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidNotEqualTo(Long value) {
            addCriterion("featuredmageattachId <>", value, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidGreaterThan(Long value) {
            addCriterion("featuredmageattachId >", value, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidGreaterThanOrEqualTo(Long value) {
            addCriterion("featuredmageattachId >=", value, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidLessThan(Long value) {
            addCriterion("featuredmageattachId <", value, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidLessThanOrEqualTo(Long value) {
            addCriterion("featuredmageattachId <=", value, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidIn(List<Long> values) {
            addCriterion("featuredmageattachId in", values, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidNotIn(List<Long> values) {
            addCriterion("featuredmageattachId not in", values, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidBetween(Long value1, Long value2) {
            addCriterion("featuredmageattachId between", value1, value2, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andFeaturedmageattachidNotBetween(Long value1, Long value2) {
            addCriterion("featuredmageattachId not between", value1, value2, "featuredmageattachid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
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

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
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

        public Criteria andDatepuishedIsNull() {
            addCriterion("datePuished is null");
            return (Criteria) this;
        }

        public Criteria andDatepuishedIsNotNull() {
            addCriterion("datePuished is not null");
            return (Criteria) this;
        }

        public Criteria andDatepuishedEqualTo(Date value) {
            addCriterion("datePuished =", value, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedNotEqualTo(Date value) {
            addCriterion("datePuished <>", value, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedGreaterThan(Date value) {
            addCriterion("datePuished >", value, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedGreaterThanOrEqualTo(Date value) {
            addCriterion("datePuished >=", value, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedLessThan(Date value) {
            addCriterion("datePuished <", value, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedLessThanOrEqualTo(Date value) {
            addCriterion("datePuished <=", value, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedIn(List<Date> values) {
            addCriterion("datePuished in", values, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedNotIn(List<Date> values) {
            addCriterion("datePuished not in", values, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedBetween(Date value1, Date value2) {
            addCriterion("datePuished between", value1, value2, "datepuished");
            return (Criteria) this;
        }

        public Criteria andDatepuishedNotBetween(Date value1, Date value2) {
            addCriterion("datePuished not between", value1, value2, "datepuished");
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

        public Criteria andLastmodifedIsNull() {
            addCriterion("lastModifed is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifedIsNotNull() {
            addCriterion("lastModifed is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifedEqualTo(Date value) {
            addCriterion("lastModifed =", value, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedNotEqualTo(Date value) {
            addCriterion("lastModifed <>", value, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedGreaterThan(Date value) {
            addCriterion("lastModifed >", value, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedGreaterThanOrEqualTo(Date value) {
            addCriterion("lastModifed >=", value, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedLessThan(Date value) {
            addCriterion("lastModifed <", value, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedLessThanOrEqualTo(Date value) {
            addCriterion("lastModifed <=", value, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedIn(List<Date> values) {
            addCriterion("lastModifed in", values, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedNotIn(List<Date> values) {
            addCriterion("lastModifed not in", values, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedBetween(Date value1, Date value2) {
            addCriterion("lastModifed between", value1, value2, "lastmodifed");
            return (Criteria) this;
        }

        public Criteria andLastmodifedNotBetween(Date value1, Date value2) {
            addCriterion("lastModifed not between", value1, value2, "lastmodifed");
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