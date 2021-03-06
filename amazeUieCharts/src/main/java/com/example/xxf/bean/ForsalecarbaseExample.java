package com.example.xxf.bean;

import java.util.ArrayList;
import java.util.List;

public class ForsalecarbaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForsalecarbaseExample() {
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarIsNull() {
            addCriterion("forSaleNewCar is null");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarIsNotNull() {
            addCriterion("forSaleNewCar is not null");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarEqualTo(String value) {
            addCriterion("forSaleNewCar =", value, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarNotEqualTo(String value) {
            addCriterion("forSaleNewCar <>", value, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarGreaterThan(String value) {
            addCriterion("forSaleNewCar >", value, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarGreaterThanOrEqualTo(String value) {
            addCriterion("forSaleNewCar >=", value, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarLessThan(String value) {
            addCriterion("forSaleNewCar <", value, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarLessThanOrEqualTo(String value) {
            addCriterion("forSaleNewCar <=", value, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarLike(String value) {
            addCriterion("forSaleNewCar like", value, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarNotLike(String value) {
            addCriterion("forSaleNewCar not like", value, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarIn(List<String> values) {
            addCriterion("forSaleNewCar in", values, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarNotIn(List<String> values) {
            addCriterion("forSaleNewCar not in", values, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarBetween(String value1, String value2) {
            addCriterion("forSaleNewCar between", value1, value2, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsalenewcarNotBetween(String value1, String value2) {
            addCriterion("forSaleNewCar not between", value1, value2, "forsalenewcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarIsNull() {
            addCriterion("forSaleUsedCar is null");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarIsNotNull() {
            addCriterion("forSaleUsedCar is not null");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarEqualTo(String value) {
            addCriterion("forSaleUsedCar =", value, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarNotEqualTo(String value) {
            addCriterion("forSaleUsedCar <>", value, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarGreaterThan(String value) {
            addCriterion("forSaleUsedCar >", value, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarGreaterThanOrEqualTo(String value) {
            addCriterion("forSaleUsedCar >=", value, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarLessThan(String value) {
            addCriterion("forSaleUsedCar <", value, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarLessThanOrEqualTo(String value) {
            addCriterion("forSaleUsedCar <=", value, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarLike(String value) {
            addCriterion("forSaleUsedCar like", value, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarNotLike(String value) {
            addCriterion("forSaleUsedCar not like", value, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarIn(List<String> values) {
            addCriterion("forSaleUsedCar in", values, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarNotIn(List<String> values) {
            addCriterion("forSaleUsedCar not in", values, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarBetween(String value1, String value2) {
            addCriterion("forSaleUsedCar between", value1, value2, "forsaleusedcar");
            return (Criteria) this;
        }

        public Criteria andForsaleusedcarNotBetween(String value1, String value2) {
            addCriterion("forSaleUsedCar not between", value1, value2, "forsaleusedcar");
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