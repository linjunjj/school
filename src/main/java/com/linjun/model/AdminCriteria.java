package com.linjun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminCriteria() {
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

        public Criteria andBuildtimeIsNull() {
            addCriterion("buildTime is null");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIsNotNull() {
            addCriterion("buildTime is not null");
            return (Criteria) this;
        }

        public Criteria andBuildtimeEqualTo(Date value) {
            addCriterion("buildTime =", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotEqualTo(Date value) {
            addCriterion("buildTime <>", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeGreaterThan(Date value) {
            addCriterion("buildTime >", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buildTime >=", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLessThan(Date value) {
            addCriterion("buildTime <", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLessThanOrEqualTo(Date value) {
            addCriterion("buildTime <=", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIn(List<Date> values) {
            addCriterion("buildTime in", values, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotIn(List<Date> values) {
            addCriterion("buildTime not in", values, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeBetween(Date value1, Date value2) {
            addCriterion("buildTime between", value1, value2, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotBetween(Date value1, Date value2) {
            addCriterion("buildTime not between", value1, value2, "buildtime");
            return (Criteria) this;
        }

        public Criteria andSignintimeIsNull() {
            addCriterion("signinTime is null");
            return (Criteria) this;
        }

        public Criteria andSignintimeIsNotNull() {
            addCriterion("signinTime is not null");
            return (Criteria) this;
        }

        public Criteria andSignintimeEqualTo(Date value) {
            addCriterion("signinTime =", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotEqualTo(Date value) {
            addCriterion("signinTime <>", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeGreaterThan(Date value) {
            addCriterion("signinTime >", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signinTime >=", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeLessThan(Date value) {
            addCriterion("signinTime <", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeLessThanOrEqualTo(Date value) {
            addCriterion("signinTime <=", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeIn(List<Date> values) {
            addCriterion("signinTime in", values, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotIn(List<Date> values) {
            addCriterion("signinTime not in", values, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeBetween(Date value1, Date value2) {
            addCriterion("signinTime between", value1, value2, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotBetween(Date value1, Date value2) {
            addCriterion("signinTime not between", value1, value2, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeIsNull() {
            addCriterion("signoutTime is null");
            return (Criteria) this;
        }

        public Criteria andSignouttimeIsNotNull() {
            addCriterion("signoutTime is not null");
            return (Criteria) this;
        }

        public Criteria andSignouttimeEqualTo(Date value) {
            addCriterion("signoutTime =", value, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeNotEqualTo(Date value) {
            addCriterion("signoutTime <>", value, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeGreaterThan(Date value) {
            addCriterion("signoutTime >", value, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signoutTime >=", value, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeLessThan(Date value) {
            addCriterion("signoutTime <", value, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeLessThanOrEqualTo(Date value) {
            addCriterion("signoutTime <=", value, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeIn(List<Date> values) {
            addCriterion("signoutTime in", values, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeNotIn(List<Date> values) {
            addCriterion("signoutTime not in", values, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeBetween(Date value1, Date value2) {
            addCriterion("signoutTime between", value1, value2, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSignouttimeNotBetween(Date value1, Date value2) {
            addCriterion("signoutTime not between", value1, value2, "signouttime");
            return (Criteria) this;
        }

        public Criteria andSigtimeIsNull() {
            addCriterion("sigTime is null");
            return (Criteria) this;
        }

        public Criteria andSigtimeIsNotNull() {
            addCriterion("sigTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigtimeEqualTo(Date value) {
            addCriterion("sigTime =", value, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeNotEqualTo(Date value) {
            addCriterion("sigTime <>", value, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeGreaterThan(Date value) {
            addCriterion("sigTime >", value, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sigTime >=", value, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeLessThan(Date value) {
            addCriterion("sigTime <", value, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeLessThanOrEqualTo(Date value) {
            addCriterion("sigTime <=", value, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeIn(List<Date> values) {
            addCriterion("sigTime in", values, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeNotIn(List<Date> values) {
            addCriterion("sigTime not in", values, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeBetween(Date value1, Date value2) {
            addCriterion("sigTime between", value1, value2, "sigtime");
            return (Criteria) this;
        }

        public Criteria andSigtimeNotBetween(Date value1, Date value2) {
            addCriterion("sigTime not between", value1, value2, "sigtime");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNull() {
            addCriterion("adminaccount is null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNotNull() {
            addCriterion("adminaccount is not null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountEqualTo(String value) {
            addCriterion("adminaccount =", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotEqualTo(String value) {
            addCriterion("adminaccount <>", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThan(String value) {
            addCriterion("adminaccount >", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThanOrEqualTo(String value) {
            addCriterion("adminaccount >=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThan(String value) {
            addCriterion("adminaccount <", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThanOrEqualTo(String value) {
            addCriterion("adminaccount <=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLike(String value) {
            addCriterion("adminaccount like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotLike(String value) {
            addCriterion("adminaccount not like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIn(List<String> values) {
            addCriterion("adminaccount in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotIn(List<String> values) {
            addCriterion("adminaccount not in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountBetween(String value1, String value2) {
            addCriterion("adminaccount between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotBetween(String value1, String value2) {
            addCriterion("adminaccount not between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNull() {
            addCriterion("adminPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("adminPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("adminPassword =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("adminPassword <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("adminPassword >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adminPassword >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("adminPassword <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("adminPassword <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("adminPassword like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("adminPassword not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("adminPassword in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("adminPassword not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("adminPassword between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("adminPassword not between", value1, value2, "adminpassword");
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