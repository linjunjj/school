package com.linjun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlateCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlateCriteria() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andIsenableIsNull() {
            addCriterion("isEnable is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("isEnable is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(String value) {
            addCriterion("isEnable =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(String value) {
            addCriterion("isEnable <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(String value) {
            addCriterion("isEnable >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(String value) {
            addCriterion("isEnable >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(String value) {
            addCriterion("isEnable <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(String value) {
            addCriterion("isEnable <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLike(String value) {
            addCriterion("isEnable like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotLike(String value) {
            addCriterion("isEnable not like", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<String> values) {
            addCriterion("isEnable in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<String> values) {
            addCriterion("isEnable not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(String value1, String value2) {
            addCriterion("isEnable between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(String value1, String value2) {
            addCriterion("isEnable not between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andDisplayolderIsNull() {
            addCriterion("displayOlder is null");
            return (Criteria) this;
        }

        public Criteria andDisplayolderIsNotNull() {
            addCriterion("displayOlder is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayolderEqualTo(Long value) {
            addCriterion("displayOlder =", value, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderNotEqualTo(Long value) {
            addCriterion("displayOlder <>", value, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderGreaterThan(Long value) {
            addCriterion("displayOlder >", value, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderGreaterThanOrEqualTo(Long value) {
            addCriterion("displayOlder >=", value, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderLessThan(Long value) {
            addCriterion("displayOlder <", value, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderLessThanOrEqualTo(Long value) {
            addCriterion("displayOlder <=", value, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderIn(List<Long> values) {
            addCriterion("displayOlder in", values, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderNotIn(List<Long> values) {
            addCriterion("displayOlder not in", values, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderBetween(Long value1, Long value2) {
            addCriterion("displayOlder between", value1, value2, "displayolder");
            return (Criteria) this;
        }

        public Criteria andDisplayolderNotBetween(Long value1, Long value2) {
            addCriterion("displayOlder not between", value1, value2, "displayolder");
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