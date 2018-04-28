package com.example.xxf.bean;

import java.util.ArrayList;
import java.util.List;

public class TBaseDataAnalyzeMenuAclExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBaseDataAnalyzeMenuAclExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNull() {
            addCriterion("C_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("C_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(Integer value) {
            addCriterion("C_TYPE =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(Integer value) {
            addCriterion("C_TYPE <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(Integer value) {
            addCriterion("C_TYPE >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_TYPE >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(Integer value) {
            addCriterion("C_TYPE <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(Integer value) {
            addCriterion("C_TYPE <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<Integer> values) {
            addCriterion("C_TYPE in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<Integer> values) {
            addCriterion("C_TYPE not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(Integer value1, Integer value2) {
            addCriterion("C_TYPE between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("C_TYPE not between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCCodeIsNull() {
            addCriterion("C_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCCodeIsNotNull() {
            addCriterion("C_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCCodeEqualTo(String value) {
            addCriterion("C_CODE =", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeNotEqualTo(String value) {
            addCriterion("C_CODE <>", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeGreaterThan(String value) {
            addCriterion("C_CODE >", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CODE >=", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeLessThan(String value) {
            addCriterion("C_CODE <", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeLessThanOrEqualTo(String value) {
            addCriterion("C_CODE <=", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeLike(String value) {
            addCriterion("C_CODE like", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeNotLike(String value) {
            addCriterion("C_CODE not like", value, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeIn(List<String> values) {
            addCriterion("C_CODE in", values, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeNotIn(List<String> values) {
            addCriterion("C_CODE not in", values, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeBetween(String value1, String value2) {
            addCriterion("C_CODE between", value1, value2, "cCode");
            return (Criteria) this;
        }

        public Criteria andCCodeNotBetween(String value1, String value2) {
            addCriterion("C_CODE not between", value1, value2, "cCode");
            return (Criteria) this;
        }

        public Criteria andCMenuidIsNull() {
            addCriterion("C_MENUID is null");
            return (Criteria) this;
        }

        public Criteria andCMenuidIsNotNull() {
            addCriterion("C_MENUID is not null");
            return (Criteria) this;
        }

        public Criteria andCMenuidEqualTo(Integer value) {
            addCriterion("C_MENUID =", value, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidNotEqualTo(Integer value) {
            addCriterion("C_MENUID <>", value, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidGreaterThan(Integer value) {
            addCriterion("C_MENUID >", value, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_MENUID >=", value, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidLessThan(Integer value) {
            addCriterion("C_MENUID <", value, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("C_MENUID <=", value, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidIn(List<Integer> values) {
            addCriterion("C_MENUID in", values, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidNotIn(List<Integer> values) {
            addCriterion("C_MENUID not in", values, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidBetween(Integer value1, Integer value2) {
            addCriterion("C_MENUID between", value1, value2, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("C_MENUID not between", value1, value2, "cMenuid");
            return (Criteria) this;
        }

        public Criteria andCPerioddateIsNull() {
            addCriterion("C_PERIODDATE is null");
            return (Criteria) this;
        }

        public Criteria andCPerioddateIsNotNull() {
            addCriterion("C_PERIODDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCPerioddateEqualTo(String value) {
            addCriterion("C_PERIODDATE =", value, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateNotEqualTo(String value) {
            addCriterion("C_PERIODDATE <>", value, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateGreaterThan(String value) {
            addCriterion("C_PERIODDATE >", value, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateGreaterThanOrEqualTo(String value) {
            addCriterion("C_PERIODDATE >=", value, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateLessThan(String value) {
            addCriterion("C_PERIODDATE <", value, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateLessThanOrEqualTo(String value) {
            addCriterion("C_PERIODDATE <=", value, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateLike(String value) {
            addCriterion("C_PERIODDATE like", value, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateNotLike(String value) {
            addCriterion("C_PERIODDATE not like", value, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateIn(List<String> values) {
            addCriterion("C_PERIODDATE in", values, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateNotIn(List<String> values) {
            addCriterion("C_PERIODDATE not in", values, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateBetween(String value1, String value2) {
            addCriterion("C_PERIODDATE between", value1, value2, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCPerioddateNotBetween(String value1, String value2) {
            addCriterion("C_PERIODDATE not between", value1, value2, "cPerioddate");
            return (Criteria) this;
        }

        public Criteria andCOpttypeIsNull() {
            addCriterion("C_OPTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCOpttypeIsNotNull() {
            addCriterion("C_OPTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCOpttypeEqualTo(Integer value) {
            addCriterion("C_OPTTYPE =", value, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeNotEqualTo(Integer value) {
            addCriterion("C_OPTTYPE <>", value, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeGreaterThan(Integer value) {
            addCriterion("C_OPTTYPE >", value, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_OPTTYPE >=", value, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeLessThan(Integer value) {
            addCriterion("C_OPTTYPE <", value, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeLessThanOrEqualTo(Integer value) {
            addCriterion("C_OPTTYPE <=", value, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeIn(List<Integer> values) {
            addCriterion("C_OPTTYPE in", values, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeNotIn(List<Integer> values) {
            addCriterion("C_OPTTYPE not in", values, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeBetween(Integer value1, Integer value2) {
            addCriterion("C_OPTTYPE between", value1, value2, "cOpttype");
            return (Criteria) this;
        }

        public Criteria andCOpttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("C_OPTTYPE not between", value1, value2, "cOpttype");
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