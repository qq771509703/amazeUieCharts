package com.example.xxf.bean;

import java.util.ArrayList;
import java.util.List;

public class TBaseDataAnalyzeSalebasedataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBaseDataAnalyzeSalebasedataExample() {
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

        public Criteria andFcontracttimeIsNull() {
            addCriterion("FContractTime is null");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeIsNotNull() {
            addCriterion("FContractTime is not null");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeEqualTo(String value) {
            addCriterion("FContractTime =", value, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeNotEqualTo(String value) {
            addCriterion("FContractTime <>", value, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeGreaterThan(String value) {
            addCriterion("FContractTime >", value, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeGreaterThanOrEqualTo(String value) {
            addCriterion("FContractTime >=", value, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeLessThan(String value) {
            addCriterion("FContractTime <", value, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeLessThanOrEqualTo(String value) {
            addCriterion("FContractTime <=", value, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeLike(String value) {
            addCriterion("FContractTime like", value, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeNotLike(String value) {
            addCriterion("FContractTime not like", value, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeIn(List<String> values) {
            addCriterion("FContractTime in", values, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeNotIn(List<String> values) {
            addCriterion("FContractTime not in", values, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeBetween(String value1, String value2) {
            addCriterion("FContractTime between", value1, value2, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontracttimeNotBetween(String value1, String value2) {
            addCriterion("FContractTime not between", value1, value2, "fcontracttime");
            return (Criteria) this;
        }

        public Criteria andFcontractIsNull() {
            addCriterion("FContract is null");
            return (Criteria) this;
        }

        public Criteria andFcontractIsNotNull() {
            addCriterion("FContract is not null");
            return (Criteria) this;
        }

        public Criteria andFcontractEqualTo(String value) {
            addCriterion("FContract =", value, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractNotEqualTo(String value) {
            addCriterion("FContract <>", value, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractGreaterThan(String value) {
            addCriterion("FContract >", value, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractGreaterThanOrEqualTo(String value) {
            addCriterion("FContract >=", value, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractLessThan(String value) {
            addCriterion("FContract <", value, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractLessThanOrEqualTo(String value) {
            addCriterion("FContract <=", value, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractLike(String value) {
            addCriterion("FContract like", value, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractNotLike(String value) {
            addCriterion("FContract not like", value, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractIn(List<String> values) {
            addCriterion("FContract in", values, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractNotIn(List<String> values) {
            addCriterion("FContract not in", values, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractBetween(String value1, String value2) {
            addCriterion("FContract between", value1, value2, "fcontract");
            return (Criteria) this;
        }

        public Criteria andFcontractNotBetween(String value1, String value2) {
            addCriterion("FContract not between", value1, value2, "fcontract");
            return (Criteria) this;
        }

        public Criteria andSalemanIsNull() {
            addCriterion("saleman is null");
            return (Criteria) this;
        }

        public Criteria andSalemanIsNotNull() {
            addCriterion("saleman is not null");
            return (Criteria) this;
        }

        public Criteria andSalemanEqualTo(String value) {
            addCriterion("saleman =", value, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanNotEqualTo(String value) {
            addCriterion("saleman <>", value, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanGreaterThan(String value) {
            addCriterion("saleman >", value, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanGreaterThanOrEqualTo(String value) {
            addCriterion("saleman >=", value, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanLessThan(String value) {
            addCriterion("saleman <", value, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanLessThanOrEqualTo(String value) {
            addCriterion("saleman <=", value, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanLike(String value) {
            addCriterion("saleman like", value, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanNotLike(String value) {
            addCriterion("saleman not like", value, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanIn(List<String> values) {
            addCriterion("saleman in", values, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanNotIn(List<String> values) {
            addCriterion("saleman not in", values, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanBetween(String value1, String value2) {
            addCriterion("saleman between", value1, value2, "saleman");
            return (Criteria) this;
        }

        public Criteria andSalemanNotBetween(String value1, String value2) {
            addCriterion("saleman not between", value1, value2, "saleman");
            return (Criteria) this;
        }

        public Criteria andFdividendratioIsNull() {
            addCriterion("FDividendRatio is null");
            return (Criteria) this;
        }

        public Criteria andFdividendratioIsNotNull() {
            addCriterion("FDividendRatio is not null");
            return (Criteria) this;
        }

        public Criteria andFdividendratioEqualTo(String value) {
            addCriterion("FDividendRatio =", value, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioNotEqualTo(String value) {
            addCriterion("FDividendRatio <>", value, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioGreaterThan(String value) {
            addCriterion("FDividendRatio >", value, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioGreaterThanOrEqualTo(String value) {
            addCriterion("FDividendRatio >=", value, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioLessThan(String value) {
            addCriterion("FDividendRatio <", value, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioLessThanOrEqualTo(String value) {
            addCriterion("FDividendRatio <=", value, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioLike(String value) {
            addCriterion("FDividendRatio like", value, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioNotLike(String value) {
            addCriterion("FDividendRatio not like", value, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioIn(List<String> values) {
            addCriterion("FDividendRatio in", values, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioNotIn(List<String> values) {
            addCriterion("FDividendRatio not in", values, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioBetween(String value1, String value2) {
            addCriterion("FDividendRatio between", value1, value2, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andFdividendratioNotBetween(String value1, String value2) {
            addCriterion("FDividendRatio not between", value1, value2, "fdividendratio");
            return (Criteria) this;
        }

        public Criteria andSalemoneyIsNull() {
            addCriterion("salemoney is null");
            return (Criteria) this;
        }

        public Criteria andSalemoneyIsNotNull() {
            addCriterion("salemoney is not null");
            return (Criteria) this;
        }

        public Criteria andSalemoneyEqualTo(String value) {
            addCriterion("salemoney =", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyNotEqualTo(String value) {
            addCriterion("salemoney <>", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyGreaterThan(String value) {
            addCriterion("salemoney >", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("salemoney >=", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyLessThan(String value) {
            addCriterion("salemoney <", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyLessThanOrEqualTo(String value) {
            addCriterion("salemoney <=", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyLike(String value) {
            addCriterion("salemoney like", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyNotLike(String value) {
            addCriterion("salemoney not like", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyIn(List<String> values) {
            addCriterion("salemoney in", values, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyNotIn(List<String> values) {
            addCriterion("salemoney not in", values, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyBetween(String value1, String value2) {
            addCriterion("salemoney between", value1, value2, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyNotBetween(String value1, String value2) {
            addCriterion("salemoney not between", value1, value2, "salemoney");
            return (Criteria) this;
        }

        public Criteria andFplatenumIsNull() {
            addCriterion("FPlateNum is null");
            return (Criteria) this;
        }

        public Criteria andFplatenumIsNotNull() {
            addCriterion("FPlateNum is not null");
            return (Criteria) this;
        }

        public Criteria andFplatenumEqualTo(String value) {
            addCriterion("FPlateNum =", value, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumNotEqualTo(String value) {
            addCriterion("FPlateNum <>", value, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumGreaterThan(String value) {
            addCriterion("FPlateNum >", value, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumGreaterThanOrEqualTo(String value) {
            addCriterion("FPlateNum >=", value, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumLessThan(String value) {
            addCriterion("FPlateNum <", value, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumLessThanOrEqualTo(String value) {
            addCriterion("FPlateNum <=", value, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumLike(String value) {
            addCriterion("FPlateNum like", value, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumNotLike(String value) {
            addCriterion("FPlateNum not like", value, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumIn(List<String> values) {
            addCriterion("FPlateNum in", values, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumNotIn(List<String> values) {
            addCriterion("FPlateNum not in", values, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumBetween(String value1, String value2) {
            addCriterion("FPlateNum between", value1, value2, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFplatenumNotBetween(String value1, String value2) {
            addCriterion("FPlateNum not between", value1, value2, "fplatenum");
            return (Criteria) this;
        }

        public Criteria andFbrandIsNull() {
            addCriterion("FBrand is null");
            return (Criteria) this;
        }

        public Criteria andFbrandIsNotNull() {
            addCriterion("FBrand is not null");
            return (Criteria) this;
        }

        public Criteria andFbrandEqualTo(String value) {
            addCriterion("FBrand =", value, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandNotEqualTo(String value) {
            addCriterion("FBrand <>", value, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandGreaterThan(String value) {
            addCriterion("FBrand >", value, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandGreaterThanOrEqualTo(String value) {
            addCriterion("FBrand >=", value, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandLessThan(String value) {
            addCriterion("FBrand <", value, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandLessThanOrEqualTo(String value) {
            addCriterion("FBrand <=", value, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandLike(String value) {
            addCriterion("FBrand like", value, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandNotLike(String value) {
            addCriterion("FBrand not like", value, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandIn(List<String> values) {
            addCriterion("FBrand in", values, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandNotIn(List<String> values) {
            addCriterion("FBrand not in", values, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandBetween(String value1, String value2) {
            addCriterion("FBrand between", value1, value2, "fbrand");
            return (Criteria) this;
        }

        public Criteria andFbrandNotBetween(String value1, String value2) {
            addCriterion("FBrand not between", value1, value2, "fbrand");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("cartype is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("cartype is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("cartype =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("cartype <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("cartype >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("cartype >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("cartype <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("cartype <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("cartype like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("cartype not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("cartype in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("cartype not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("cartype between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("cartype not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andFquotypeIsNull() {
            addCriterion("FQuoType is null");
            return (Criteria) this;
        }

        public Criteria andFquotypeIsNotNull() {
            addCriterion("FQuoType is not null");
            return (Criteria) this;
        }

        public Criteria andFquotypeEqualTo(String value) {
            addCriterion("FQuoType =", value, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeNotEqualTo(String value) {
            addCriterion("FQuoType <>", value, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeGreaterThan(String value) {
            addCriterion("FQuoType >", value, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeGreaterThanOrEqualTo(String value) {
            addCriterion("FQuoType >=", value, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeLessThan(String value) {
            addCriterion("FQuoType <", value, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeLessThanOrEqualTo(String value) {
            addCriterion("FQuoType <=", value, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeLike(String value) {
            addCriterion("FQuoType like", value, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeNotLike(String value) {
            addCriterion("FQuoType not like", value, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeIn(List<String> values) {
            addCriterion("FQuoType in", values, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeNotIn(List<String> values) {
            addCriterion("FQuoType not in", values, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeBetween(String value1, String value2) {
            addCriterion("FQuoType between", value1, value2, "fquotype");
            return (Criteria) this;
        }

        public Criteria andFquotypeNotBetween(String value1, String value2) {
            addCriterion("FQuoType not between", value1, value2, "fquotype");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
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