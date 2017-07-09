package com.fk.gxwm.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WgAnonymousDynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WgAnonymousDynamicExample() {
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

        public Criteria andDynamicidIsNull() {
            addCriterion("dynamicId is null");
            return (Criteria) this;
        }

        public Criteria andDynamicidIsNotNull() {
            addCriterion("dynamicId is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicidEqualTo(Long value) {
            addCriterion("dynamicId =", value, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidNotEqualTo(Long value) {
            addCriterion("dynamicId <>", value, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidGreaterThan(Long value) {
            addCriterion("dynamicId >", value, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidGreaterThanOrEqualTo(Long value) {
            addCriterion("dynamicId >=", value, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidLessThan(Long value) {
            addCriterion("dynamicId <", value, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidLessThanOrEqualTo(Long value) {
            addCriterion("dynamicId <=", value, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidIn(List<Long> values) {
            addCriterion("dynamicId in", values, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidNotIn(List<Long> values) {
            addCriterion("dynamicId not in", values, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidBetween(Long value1, Long value2) {
            addCriterion("dynamicId between", value1, value2, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andDynamicidNotBetween(Long value1, Long value2) {
            addCriterion("dynamicId not between", value1, value2, "dynamicid");
            return (Criteria) this;
        }

        public Criteria andUserloginnameIsNull() {
            addCriterion("userLoginName is null");
            return (Criteria) this;
        }

        public Criteria andUserloginnameIsNotNull() {
            addCriterion("userLoginName is not null");
            return (Criteria) this;
        }

        public Criteria andUserloginnameEqualTo(String value) {
            addCriterion("userLoginName =", value, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameNotEqualTo(String value) {
            addCriterion("userLoginName <>", value, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameGreaterThan(String value) {
            addCriterion("userLoginName >", value, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("userLoginName >=", value, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameLessThan(String value) {
            addCriterion("userLoginName <", value, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameLessThanOrEqualTo(String value) {
            addCriterion("userLoginName <=", value, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameLike(String value) {
            addCriterion("userLoginName like", value, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameNotLike(String value) {
            addCriterion("userLoginName not like", value, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameIn(List<String> values) {
            addCriterion("userLoginName in", values, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameNotIn(List<String> values) {
            addCriterion("userLoginName not in", values, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameBetween(String value1, String value2) {
            addCriterion("userLoginName between", value1, value2, "userloginname");
            return (Criteria) this;
        }

        public Criteria andUserloginnameNotBetween(String value1, String value2) {
            addCriterion("userLoginName not between", value1, value2, "userloginname");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoIsNull() {
            addCriterion("dynamicInfo is null");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoIsNotNull() {
            addCriterion("dynamicInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoEqualTo(String value) {
            addCriterion("dynamicInfo =", value, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoNotEqualTo(String value) {
            addCriterion("dynamicInfo <>", value, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoGreaterThan(String value) {
            addCriterion("dynamicInfo >", value, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoGreaterThanOrEqualTo(String value) {
            addCriterion("dynamicInfo >=", value, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoLessThan(String value) {
            addCriterion("dynamicInfo <", value, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoLessThanOrEqualTo(String value) {
            addCriterion("dynamicInfo <=", value, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoLike(String value) {
            addCriterion("dynamicInfo like", value, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoNotLike(String value) {
            addCriterion("dynamicInfo not like", value, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoIn(List<String> values) {
            addCriterion("dynamicInfo in", values, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoNotIn(List<String> values) {
            addCriterion("dynamicInfo not in", values, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoBetween(String value1, String value2) {
            addCriterion("dynamicInfo between", value1, value2, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicinfoNotBetween(String value1, String value2) {
            addCriterion("dynamicInfo not between", value1, value2, "dynamicinfo");
            return (Criteria) this;
        }

        public Criteria andDynamicimgIsNull() {
            addCriterion("dynamicImg is null");
            return (Criteria) this;
        }

        public Criteria andDynamicimgIsNotNull() {
            addCriterion("dynamicImg is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicimgEqualTo(String value) {
            addCriterion("dynamicImg =", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgNotEqualTo(String value) {
            addCriterion("dynamicImg <>", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgGreaterThan(String value) {
            addCriterion("dynamicImg >", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgGreaterThanOrEqualTo(String value) {
            addCriterion("dynamicImg >=", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgLessThan(String value) {
            addCriterion("dynamicImg <", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgLessThanOrEqualTo(String value) {
            addCriterion("dynamicImg <=", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgLike(String value) {
            addCriterion("dynamicImg like", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgNotLike(String value) {
            addCriterion("dynamicImg not like", value, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgIn(List<String> values) {
            addCriterion("dynamicImg in", values, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgNotIn(List<String> values) {
            addCriterion("dynamicImg not in", values, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgBetween(String value1, String value2) {
            addCriterion("dynamicImg between", value1, value2, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andDynamicimgNotBetween(String value1, String value2) {
            addCriterion("dynamicImg not between", value1, value2, "dynamicimg");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNull() {
            addCriterion("releaseTime is null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNotNull() {
            addCriterion("releaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeEqualTo(Date value) {
            addCriterion("releaseTime =", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotEqualTo(Date value) {
            addCriterion("releaseTime <>", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThan(Date value) {
            addCriterion("releaseTime >", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("releaseTime >=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThan(Date value) {
            addCriterion("releaseTime <", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("releaseTime <=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIn(List<Date> values) {
            addCriterion("releaseTime in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotIn(List<Date> values) {
            addCriterion("releaseTime not in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeBetween(Date value1, Date value2) {
            addCriterion("releaseTime between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("releaseTime not between", value1, value2, "releasetime");
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