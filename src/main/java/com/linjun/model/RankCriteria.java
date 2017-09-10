package com.linjun.model;

import java.util.ArrayList;
import java.util.List;

public class RankCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RankCriteria() {
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

        public Criteria andPointlowerIsNull() {
            addCriterion("pointLower is null");
            return (Criteria) this;
        }

        public Criteria andPointlowerIsNotNull() {
            addCriterion("pointLower is not null");
            return (Criteria) this;
        }

        public Criteria andPointlowerEqualTo(Long value) {
            addCriterion("pointLower =", value, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerNotEqualTo(Long value) {
            addCriterion("pointLower <>", value, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerGreaterThan(Long value) {
            addCriterion("pointLower >", value, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerGreaterThanOrEqualTo(Long value) {
            addCriterion("pointLower >=", value, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerLessThan(Long value) {
            addCriterion("pointLower <", value, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerLessThanOrEqualTo(Long value) {
            addCriterion("pointLower <=", value, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerIn(List<Long> values) {
            addCriterion("pointLower in", values, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerNotIn(List<Long> values) {
            addCriterion("pointLower not in", values, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerBetween(Long value1, Long value2) {
            addCriterion("pointLower between", value1, value2, "pointlower");
            return (Criteria) this;
        }

        public Criteria andPointlowerNotBetween(Long value1, Long value2) {
            addCriterion("pointLower not between", value1, value2, "pointlower");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Long value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Long value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Long value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Long value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Long value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Long value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Long> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Long> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Long value1, Long value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Long value1, Long value2) {
            addCriterion("rank not between", value1, value2, "rank");
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

        public Criteria andRanknameIsNull() {
            addCriterion("rankName is null");
            return (Criteria) this;
        }

        public Criteria andRanknameIsNotNull() {
            addCriterion("rankName is not null");
            return (Criteria) this;
        }

        public Criteria andRanknameEqualTo(String value) {
            addCriterion("rankName =", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameNotEqualTo(String value) {
            addCriterion("rankName <>", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameGreaterThan(String value) {
            addCriterion("rankName >", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameGreaterThanOrEqualTo(String value) {
            addCriterion("rankName >=", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameLessThan(String value) {
            addCriterion("rankName <", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameLessThanOrEqualTo(String value) {
            addCriterion("rankName <=", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameLike(String value) {
            addCriterion("rankName like", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameNotLike(String value) {
            addCriterion("rankName not like", value, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameIn(List<String> values) {
            addCriterion("rankName in", values, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameNotIn(List<String> values) {
            addCriterion("rankName not in", values, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameBetween(String value1, String value2) {
            addCriterion("rankName between", value1, value2, "rankname");
            return (Criteria) this;
        }

        public Criteria andRanknameNotBetween(String value1, String value2) {
            addCriterion("rankName not between", value1, value2, "rankname");
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