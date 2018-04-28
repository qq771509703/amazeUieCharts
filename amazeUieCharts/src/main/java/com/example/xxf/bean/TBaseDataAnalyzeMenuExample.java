package com.example.xxf.bean;

import java.util.ArrayList;
import java.util.List;

public class TBaseDataAnalyzeMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBaseDataAnalyzeMenuExample() {
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

        public Criteria andCIconIsNull() {
            addCriterion("C_ICON is null");
            return (Criteria) this;
        }

        public Criteria andCIconIsNotNull() {
            addCriterion("C_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andCIconEqualTo(String value) {
            addCriterion("C_ICON =", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconNotEqualTo(String value) {
            addCriterion("C_ICON <>", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconGreaterThan(String value) {
            addCriterion("C_ICON >", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconGreaterThanOrEqualTo(String value) {
            addCriterion("C_ICON >=", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconLessThan(String value) {
            addCriterion("C_ICON <", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconLessThanOrEqualTo(String value) {
            addCriterion("C_ICON <=", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconLike(String value) {
            addCriterion("C_ICON like", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconNotLike(String value) {
            addCriterion("C_ICON not like", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconIn(List<String> values) {
            addCriterion("C_ICON in", values, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconNotIn(List<String> values) {
            addCriterion("C_ICON not in", values, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconBetween(String value1, String value2) {
            addCriterion("C_ICON between", value1, value2, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconNotBetween(String value1, String value2) {
            addCriterion("C_ICON not between", value1, value2, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNull() {
            addCriterion("C_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNotNull() {
            addCriterion("C_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCTitleEqualTo(String value) {
            addCriterion("C_TITLE =", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotEqualTo(String value) {
            addCriterion("C_TITLE <>", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThan(String value) {
            addCriterion("C_TITLE >", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThanOrEqualTo(String value) {
            addCriterion("C_TITLE >=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThan(String value) {
            addCriterion("C_TITLE <", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThanOrEqualTo(String value) {
            addCriterion("C_TITLE <=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLike(String value) {
            addCriterion("C_TITLE like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotLike(String value) {
            addCriterion("C_TITLE not like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleIn(List<String> values) {
            addCriterion("C_TITLE in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotIn(List<String> values) {
            addCriterion("C_TITLE not in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleBetween(String value1, String value2) {
            addCriterion("C_TITLE between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotBetween(String value1, String value2) {
            addCriterion("C_TITLE not between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCUrlIsNull() {
            addCriterion("C_URL is null");
            return (Criteria) this;
        }

        public Criteria andCUrlIsNotNull() {
            addCriterion("C_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCUrlEqualTo(String value) {
            addCriterion("C_URL =", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotEqualTo(String value) {
            addCriterion("C_URL <>", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlGreaterThan(String value) {
            addCriterion("C_URL >", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlGreaterThanOrEqualTo(String value) {
            addCriterion("C_URL >=", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLessThan(String value) {
            addCriterion("C_URL <", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLessThanOrEqualTo(String value) {
            addCriterion("C_URL <=", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLike(String value) {
            addCriterion("C_URL like", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotLike(String value) {
            addCriterion("C_URL not like", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlIn(List<String> values) {
            addCriterion("C_URL in", values, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotIn(List<String> values) {
            addCriterion("C_URL not in", values, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlBetween(String value1, String value2) {
            addCriterion("C_URL between", value1, value2, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotBetween(String value1, String value2) {
            addCriterion("C_URL not between", value1, value2, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCParentidIsNull() {
            addCriterion("C_PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andCParentidIsNotNull() {
            addCriterion("C_PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCParentidEqualTo(Integer value) {
            addCriterion("C_PARENTID =", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotEqualTo(Integer value) {
            addCriterion("C_PARENTID <>", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidGreaterThan(Integer value) {
            addCriterion("C_PARENTID >", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_PARENTID >=", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidLessThan(Integer value) {
            addCriterion("C_PARENTID <", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidLessThanOrEqualTo(Integer value) {
            addCriterion("C_PARENTID <=", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidIn(List<Integer> values) {
            addCriterion("C_PARENTID in", values, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotIn(List<Integer> values) {
            addCriterion("C_PARENTID not in", values, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidBetween(Integer value1, Integer value2) {
            addCriterion("C_PARENTID between", value1, value2, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("C_PARENTID not between", value1, value2, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCLevelIsNull() {
            addCriterion("C_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCLevelIsNotNull() {
            addCriterion("C_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCLevelEqualTo(Integer value) {
            addCriterion("C_LEVEL =", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotEqualTo(Integer value) {
            addCriterion("C_LEVEL <>", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelGreaterThan(Integer value) {
            addCriterion("C_LEVEL >", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_LEVEL >=", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelLessThan(Integer value) {
            addCriterion("C_LEVEL <", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelLessThanOrEqualTo(Integer value) {
            addCriterion("C_LEVEL <=", value, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelIn(List<Integer> values) {
            addCriterion("C_LEVEL in", values, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotIn(List<Integer> values) {
            addCriterion("C_LEVEL not in", values, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelBetween(Integer value1, Integer value2) {
            addCriterion("C_LEVEL between", value1, value2, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("C_LEVEL not between", value1, value2, "cLevel");
            return (Criteria) this;
        }

        public Criteria andCUseableIsNull() {
            addCriterion("C_USEABLE is null");
            return (Criteria) this;
        }

        public Criteria andCUseableIsNotNull() {
            addCriterion("C_USEABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCUseableEqualTo(Integer value) {
            addCriterion("C_USEABLE =", value, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableNotEqualTo(Integer value) {
            addCriterion("C_USEABLE <>", value, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableGreaterThan(Integer value) {
            addCriterion("C_USEABLE >", value, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_USEABLE >=", value, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableLessThan(Integer value) {
            addCriterion("C_USEABLE <", value, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableLessThanOrEqualTo(Integer value) {
            addCriterion("C_USEABLE <=", value, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableIn(List<Integer> values) {
            addCriterion("C_USEABLE in", values, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableNotIn(List<Integer> values) {
            addCriterion("C_USEABLE not in", values, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableBetween(Integer value1, Integer value2) {
            addCriterion("C_USEABLE between", value1, value2, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCUseableNotBetween(Integer value1, Integer value2) {
            addCriterion("C_USEABLE not between", value1, value2, "cUseable");
            return (Criteria) this;
        }

        public Criteria andCModelnameIsNull() {
            addCriterion("C_MODELNAME is null");
            return (Criteria) this;
        }

        public Criteria andCModelnameIsNotNull() {
            addCriterion("C_MODELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCModelnameEqualTo(String value) {
            addCriterion("C_MODELNAME =", value, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameNotEqualTo(String value) {
            addCriterion("C_MODELNAME <>", value, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameGreaterThan(String value) {
            addCriterion("C_MODELNAME >", value, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("C_MODELNAME >=", value, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameLessThan(String value) {
            addCriterion("C_MODELNAME <", value, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameLessThanOrEqualTo(String value) {
            addCriterion("C_MODELNAME <=", value, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameLike(String value) {
            addCriterion("C_MODELNAME like", value, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameNotLike(String value) {
            addCriterion("C_MODELNAME not like", value, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameIn(List<String> values) {
            addCriterion("C_MODELNAME in", values, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameNotIn(List<String> values) {
            addCriterion("C_MODELNAME not in", values, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameBetween(String value1, String value2) {
            addCriterion("C_MODELNAME between", value1, value2, "cModelname");
            return (Criteria) this;
        }

        public Criteria andCModelnameNotBetween(String value1, String value2) {
            addCriterion("C_MODELNAME not between", value1, value2, "cModelname");
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