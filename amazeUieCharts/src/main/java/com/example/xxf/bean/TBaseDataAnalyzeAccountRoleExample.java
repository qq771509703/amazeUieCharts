package com.example.xxf.bean;

import java.util.ArrayList;
import java.util.List;

public class TBaseDataAnalyzeAccountRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBaseDataAnalyzeAccountRoleExample() {
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

        public Criteria andCRolecodeIsNull() {
            addCriterion("C_ROLECODE is null");
            return (Criteria) this;
        }

        public Criteria andCRolecodeIsNotNull() {
            addCriterion("C_ROLECODE is not null");
            return (Criteria) this;
        }

        public Criteria andCRolecodeEqualTo(String value) {
            addCriterion("C_ROLECODE =", value, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeNotEqualTo(String value) {
            addCriterion("C_ROLECODE <>", value, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeGreaterThan(String value) {
            addCriterion("C_ROLECODE >", value, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ROLECODE >=", value, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeLessThan(String value) {
            addCriterion("C_ROLECODE <", value, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeLessThanOrEqualTo(String value) {
            addCriterion("C_ROLECODE <=", value, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeLike(String value) {
            addCriterion("C_ROLECODE like", value, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeNotLike(String value) {
            addCriterion("C_ROLECODE not like", value, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeIn(List<String> values) {
            addCriterion("C_ROLECODE in", values, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeNotIn(List<String> values) {
            addCriterion("C_ROLECODE not in", values, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeBetween(String value1, String value2) {
            addCriterion("C_ROLECODE between", value1, value2, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCRolecodeNotBetween(String value1, String value2) {
            addCriterion("C_ROLECODE not between", value1, value2, "cRolecode");
            return (Criteria) this;
        }

        public Criteria andCAccountIsNull() {
            addCriterion("C_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCAccountIsNotNull() {
            addCriterion("C_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCAccountEqualTo(String value) {
            addCriterion("C_ACCOUNT =", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountNotEqualTo(String value) {
            addCriterion("C_ACCOUNT <>", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountGreaterThan(String value) {
            addCriterion("C_ACCOUNT >", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountGreaterThanOrEqualTo(String value) {
            addCriterion("C_ACCOUNT >=", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountLessThan(String value) {
            addCriterion("C_ACCOUNT <", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountLessThanOrEqualTo(String value) {
            addCriterion("C_ACCOUNT <=", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountLike(String value) {
            addCriterion("C_ACCOUNT like", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountNotLike(String value) {
            addCriterion("C_ACCOUNT not like", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountIn(List<String> values) {
            addCriterion("C_ACCOUNT in", values, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountNotIn(List<String> values) {
            addCriterion("C_ACCOUNT not in", values, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountBetween(String value1, String value2) {
            addCriterion("C_ACCOUNT between", value1, value2, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountNotBetween(String value1, String value2) {
            addCriterion("C_ACCOUNT not between", value1, value2, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNull() {
            addCriterion("C_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNotNull() {
            addCriterion("C_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeEqualTo(String value) {
            addCriterion("C_CREATETIME =", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotEqualTo(String value) {
            addCriterion("C_CREATETIME <>", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThan(String value) {
            addCriterion("C_CREATETIME >", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CREATETIME >=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThan(String value) {
            addCriterion("C_CREATETIME <", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("C_CREATETIME <=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLike(String value) {
            addCriterion("C_CREATETIME like", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotLike(String value) {
            addCriterion("C_CREATETIME not like", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIn(List<String> values) {
            addCriterion("C_CREATETIME in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotIn(List<String> values) {
            addCriterion("C_CREATETIME not in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeBetween(String value1, String value2) {
            addCriterion("C_CREATETIME between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotBetween(String value1, String value2) {
            addCriterion("C_CREATETIME not between", value1, value2, "cCreatetime");
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