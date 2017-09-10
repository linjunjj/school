package com.linjun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SiglnsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiglnsCriteria() {
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

        public Criteria andExpersumIsNull() {
            addCriterion("experSum is null");
            return (Criteria) this;
        }

        public Criteria andExpersumIsNotNull() {
            addCriterion("experSum is not null");
            return (Criteria) this;
        }

        public Criteria andExpersumEqualTo(Long value) {
            addCriterion("experSum =", value, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumNotEqualTo(Long value) {
            addCriterion("experSum <>", value, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumGreaterThan(Long value) {
            addCriterion("experSum >", value, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumGreaterThanOrEqualTo(Long value) {
            addCriterion("experSum >=", value, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumLessThan(Long value) {
            addCriterion("experSum <", value, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumLessThanOrEqualTo(Long value) {
            addCriterion("experSum <=", value, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumIn(List<Long> values) {
            addCriterion("experSum in", values, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumNotIn(List<Long> values) {
            addCriterion("experSum not in", values, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumBetween(Long value1, Long value2) {
            addCriterion("experSum between", value1, value2, "expersum");
            return (Criteria) this;
        }

        public Criteria andExpersumNotBetween(Long value1, Long value2) {
            addCriterion("experSum not between", value1, value2, "expersum");
            return (Criteria) this;
        }

        public Criteria andTradepointIsNull() {
            addCriterion("tradePoint is null");
            return (Criteria) this;
        }

        public Criteria andTradepointIsNotNull() {
            addCriterion("tradePoint is not null");
            return (Criteria) this;
        }

        public Criteria andTradepointEqualTo(Long value) {
            addCriterion("tradePoint =", value, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointNotEqualTo(Long value) {
            addCriterion("tradePoint <>", value, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointGreaterThan(Long value) {
            addCriterion("tradePoint >", value, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointGreaterThanOrEqualTo(Long value) {
            addCriterion("tradePoint >=", value, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointLessThan(Long value) {
            addCriterion("tradePoint <", value, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointLessThanOrEqualTo(Long value) {
            addCriterion("tradePoint <=", value, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointIn(List<Long> values) {
            addCriterion("tradePoint in", values, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointNotIn(List<Long> values) {
            addCriterion("tradePoint not in", values, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointBetween(Long value1, Long value2) {
            addCriterion("tradePoint between", value1, value2, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andTradepointNotBetween(Long value1, Long value2) {
            addCriterion("tradePoint not between", value1, value2, "tradepoint");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountIsNull() {
            addCriterion("monthSignCount is null");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountIsNotNull() {
            addCriterion("monthSignCount is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountEqualTo(Integer value) {
            addCriterion("monthSignCount =", value, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountNotEqualTo(Integer value) {
            addCriterion("monthSignCount <>", value, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountGreaterThan(Integer value) {
            addCriterion("monthSignCount >", value, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthSignCount >=", value, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountLessThan(Integer value) {
            addCriterion("monthSignCount <", value, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountLessThanOrEqualTo(Integer value) {
            addCriterion("monthSignCount <=", value, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountIn(List<Integer> values) {
            addCriterion("monthSignCount in", values, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountNotIn(List<Integer> values) {
            addCriterion("monthSignCount not in", values, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountBetween(Integer value1, Integer value2) {
            addCriterion("monthSignCount between", value1, value2, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andMonthsigncountNotBetween(Integer value1, Integer value2) {
            addCriterion("monthSignCount not between", value1, value2, "monthsigncount");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsIsNull() {
            addCriterion("lastSiglns is null");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsIsNotNull() {
            addCriterion("lastSiglns is not null");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsEqualTo(Date value) {
            addCriterion("lastSiglns =", value, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsNotEqualTo(Date value) {
            addCriterion("lastSiglns <>", value, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsGreaterThan(Date value) {
            addCriterion("lastSiglns >", value, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsGreaterThanOrEqualTo(Date value) {
            addCriterion("lastSiglns >=", value, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsLessThan(Date value) {
            addCriterion("lastSiglns <", value, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsLessThanOrEqualTo(Date value) {
            addCriterion("lastSiglns <=", value, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsIn(List<Date> values) {
            addCriterion("lastSiglns in", values, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsNotIn(List<Date> values) {
            addCriterion("lastSiglns not in", values, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsBetween(Date value1, Date value2) {
            addCriterion("lastSiglns between", value1, value2, "lastsiglns");
            return (Criteria) this;
        }

        public Criteria andLastsiglnsNotBetween(Date value1, Date value2) {
            addCriterion("lastSiglns not between", value1, value2, "lastsiglns");
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