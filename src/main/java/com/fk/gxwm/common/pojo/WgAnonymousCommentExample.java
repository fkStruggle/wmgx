package com.fk.gxwm.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WgAnonymousCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WgAnonymousCommentExample() {
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

        public Criteria andAcommentidIsNull() {
            addCriterion("aCommentId is null");
            return (Criteria) this;
        }

        public Criteria andAcommentidIsNotNull() {
            addCriterion("aCommentId is not null");
            return (Criteria) this;
        }

        public Criteria andAcommentidEqualTo(Long value) {
            addCriterion("aCommentId =", value, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidNotEqualTo(Long value) {
            addCriterion("aCommentId <>", value, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidGreaterThan(Long value) {
            addCriterion("aCommentId >", value, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidGreaterThanOrEqualTo(Long value) {
            addCriterion("aCommentId >=", value, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidLessThan(Long value) {
            addCriterion("aCommentId <", value, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidLessThanOrEqualTo(Long value) {
            addCriterion("aCommentId <=", value, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidIn(List<Long> values) {
            addCriterion("aCommentId in", values, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidNotIn(List<Long> values) {
            addCriterion("aCommentId not in", values, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidBetween(Long value1, Long value2) {
            addCriterion("aCommentId between", value1, value2, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAcommentidNotBetween(Long value1, Long value2) {
            addCriterion("aCommentId not between", value1, value2, "acommentid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidIsNull() {
            addCriterion("aParentComId is null");
            return (Criteria) this;
        }

        public Criteria andAparentcomidIsNotNull() {
            addCriterion("aParentComId is not null");
            return (Criteria) this;
        }

        public Criteria andAparentcomidEqualTo(Long value) {
            addCriterion("aParentComId =", value, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidNotEqualTo(Long value) {
            addCriterion("aParentComId <>", value, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidGreaterThan(Long value) {
            addCriterion("aParentComId >", value, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidGreaterThanOrEqualTo(Long value) {
            addCriterion("aParentComId >=", value, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidLessThan(Long value) {
            addCriterion("aParentComId <", value, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidLessThanOrEqualTo(Long value) {
            addCriterion("aParentComId <=", value, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidIn(List<Long> values) {
            addCriterion("aParentComId in", values, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidNotIn(List<Long> values) {
            addCriterion("aParentComId not in", values, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidBetween(Long value1, Long value2) {
            addCriterion("aParentComId between", value1, value2, "aparentcomid");
            return (Criteria) this;
        }

        public Criteria andAparentcomidNotBetween(Long value1, Long value2) {
            addCriterion("aParentComId not between", value1, value2, "aparentcomid");
            return (Criteria) this;
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCcontenIsNull() {
            addCriterion("cConten is null");
            return (Criteria) this;
        }

        public Criteria andCcontenIsNotNull() {
            addCriterion("cConten is not null");
            return (Criteria) this;
        }

        public Criteria andCcontenEqualTo(String value) {
            addCriterion("cConten =", value, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenNotEqualTo(String value) {
            addCriterion("cConten <>", value, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenGreaterThan(String value) {
            addCriterion("cConten >", value, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenGreaterThanOrEqualTo(String value) {
            addCriterion("cConten >=", value, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenLessThan(String value) {
            addCriterion("cConten <", value, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenLessThanOrEqualTo(String value) {
            addCriterion("cConten <=", value, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenLike(String value) {
            addCriterion("cConten like", value, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenNotLike(String value) {
            addCriterion("cConten not like", value, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenIn(List<String> values) {
            addCriterion("cConten in", values, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenNotIn(List<String> values) {
            addCriterion("cConten not in", values, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenBetween(String value1, String value2) {
            addCriterion("cConten between", value1, value2, "cconten");
            return (Criteria) this;
        }

        public Criteria andCcontenNotBetween(String value1, String value2) {
            addCriterion("cConten not between", value1, value2, "cconten");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("cTime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("cTime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("cTime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("cTime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("cTime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cTime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("cTime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("cTime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("cTime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("cTime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("cTime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("cTime not between", value1, value2, "ctime");
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