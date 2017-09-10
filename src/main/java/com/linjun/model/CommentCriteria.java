package com.linjun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentCriteria() {
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

        public Criteria andCommenttypeIsNull() {
            addCriterion("commentType is null");
            return (Criteria) this;
        }

        public Criteria andCommenttypeIsNotNull() {
            addCriterion("commentType is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttypeEqualTo(String value) {
            addCriterion("commentType =", value, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeNotEqualTo(String value) {
            addCriterion("commentType <>", value, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeGreaterThan(String value) {
            addCriterion("commentType >", value, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("commentType >=", value, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeLessThan(String value) {
            addCriterion("commentType <", value, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeLessThanOrEqualTo(String value) {
            addCriterion("commentType <=", value, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeLike(String value) {
            addCriterion("commentType like", value, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeNotLike(String value) {
            addCriterion("commentType not like", value, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeIn(List<String> values) {
            addCriterion("commentType in", values, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeNotIn(List<String> values) {
            addCriterion("commentType not in", values, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeBetween(String value1, String value2) {
            addCriterion("commentType between", value1, value2, "commenttype");
            return (Criteria) this;
        }

        public Criteria andCommenttypeNotBetween(String value1, String value2) {
            addCriterion("commentType not between", value1, value2, "commenttype");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidIsNull() {
            addCriterion("commentObjectID is null");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidIsNotNull() {
            addCriterion("commentObjectID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidEqualTo(Integer value) {
            addCriterion("commentObjectID =", value, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidNotEqualTo(Integer value) {
            addCriterion("commentObjectID <>", value, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidGreaterThan(Integer value) {
            addCriterion("commentObjectID >", value, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentObjectID >=", value, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidLessThan(Integer value) {
            addCriterion("commentObjectID <", value, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidLessThanOrEqualTo(Integer value) {
            addCriterion("commentObjectID <=", value, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidIn(List<Integer> values) {
            addCriterion("commentObjectID in", values, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidNotIn(List<Integer> values) {
            addCriterion("commentObjectID not in", values, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidBetween(Integer value1, Integer value2) {
            addCriterion("commentObjectID between", value1, value2, "commentobjectid");
            return (Criteria) this;
        }

        public Criteria andCommentobjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentObjectID not between", value1, value2, "commentobjectid");
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

        public Criteria andIsprivateIsNull() {
            addCriterion("isPrivate is null");
            return (Criteria) this;
        }

        public Criteria andIsprivateIsNotNull() {
            addCriterion("isPrivate is not null");
            return (Criteria) this;
        }

        public Criteria andIsprivateEqualTo(String value) {
            addCriterion("isPrivate =", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotEqualTo(String value) {
            addCriterion("isPrivate <>", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateGreaterThan(String value) {
            addCriterion("isPrivate >", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateGreaterThanOrEqualTo(String value) {
            addCriterion("isPrivate >=", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLessThan(String value) {
            addCriterion("isPrivate <", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLessThanOrEqualTo(String value) {
            addCriterion("isPrivate <=", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLike(String value) {
            addCriterion("isPrivate like", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotLike(String value) {
            addCriterion("isPrivate not like", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateIn(List<String> values) {
            addCriterion("isPrivate in", values, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotIn(List<String> values) {
            addCriterion("isPrivate not in", values, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateBetween(String value1, String value2) {
            addCriterion("isPrivate between", value1, value2, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotBetween(String value1, String value2) {
            addCriterion("isPrivate not between", value1, value2, "isprivate");
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