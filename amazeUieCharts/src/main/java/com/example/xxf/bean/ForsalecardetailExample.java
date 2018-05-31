package com.example.xxf.bean;

import java.util.ArrayList;
import java.util.List;

public class ForsalecardetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForsalecardetailExample() {
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

        public Criteria andOldidIsNull() {
            addCriterion("oldID is null");
            return (Criteria) this;
        }

        public Criteria andOldidIsNotNull() {
            addCriterion("oldID is not null");
            return (Criteria) this;
        }

        public Criteria andOldidEqualTo(String value) {
            addCriterion("oldID =", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotEqualTo(String value) {
            addCriterion("oldID <>", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidGreaterThan(String value) {
            addCriterion("oldID >", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidGreaterThanOrEqualTo(String value) {
            addCriterion("oldID >=", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidLessThan(String value) {
            addCriterion("oldID <", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidLessThanOrEqualTo(String value) {
            addCriterion("oldID <=", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidLike(String value) {
            addCriterion("oldID like", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotLike(String value) {
            addCriterion("oldID not like", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidIn(List<String> values) {
            addCriterion("oldID in", values, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotIn(List<String> values) {
            addCriterion("oldID not in", values, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidBetween(String value1, String value2) {
            addCriterion("oldID between", value1, value2, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotBetween(String value1, String value2) {
            addCriterion("oldID not between", value1, value2, "oldid");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationIsNull() {
            addCriterion("carAffiliation is null");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationIsNotNull() {
            addCriterion("carAffiliation is not null");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationEqualTo(String value) {
            addCriterion("carAffiliation =", value, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationNotEqualTo(String value) {
            addCriterion("carAffiliation <>", value, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationGreaterThan(String value) {
            addCriterion("carAffiliation >", value, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("carAffiliation >=", value, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationLessThan(String value) {
            addCriterion("carAffiliation <", value, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationLessThanOrEqualTo(String value) {
            addCriterion("carAffiliation <=", value, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationLike(String value) {
            addCriterion("carAffiliation like", value, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationNotLike(String value) {
            addCriterion("carAffiliation not like", value, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationIn(List<String> values) {
            addCriterion("carAffiliation in", values, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationNotIn(List<String> values) {
            addCriterion("carAffiliation not in", values, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationBetween(String value1, String value2) {
            addCriterion("carAffiliation between", value1, value2, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andCaraffiliationNotBetween(String value1, String value2) {
            addCriterion("carAffiliation not between", value1, value2, "caraffiliation");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("VIN is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("VIN is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("VIN =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("VIN <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("VIN >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("VIN >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("VIN <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("VIN <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("VIN like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("VIN not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("VIN in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("VIN not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("VIN between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("VIN not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andPlatenumIsNull() {
            addCriterion("plateNum is null");
            return (Criteria) this;
        }

        public Criteria andPlatenumIsNotNull() {
            addCriterion("plateNum is not null");
            return (Criteria) this;
        }

        public Criteria andPlatenumEqualTo(String value) {
            addCriterion("plateNum =", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumNotEqualTo(String value) {
            addCriterion("plateNum <>", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumGreaterThan(String value) {
            addCriterion("plateNum >", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumGreaterThanOrEqualTo(String value) {
            addCriterion("plateNum >=", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumLessThan(String value) {
            addCriterion("plateNum <", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumLessThanOrEqualTo(String value) {
            addCriterion("plateNum <=", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumLike(String value) {
            addCriterion("plateNum like", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumNotLike(String value) {
            addCriterion("plateNum not like", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumIn(List<String> values) {
            addCriterion("plateNum in", values, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumNotIn(List<String> values) {
            addCriterion("plateNum not in", values, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumBetween(String value1, String value2) {
            addCriterion("plateNum between", value1, value2, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumNotBetween(String value1, String value2) {
            addCriterion("plateNum not between", value1, value2, "platenum");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("carType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("carType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("carType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("carType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("carType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("carType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("carType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("carType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("carType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("carType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("carType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("carType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("carType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("carType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceIsNull() {
            addCriterion("betweenPrice is null");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceIsNotNull() {
            addCriterion("betweenPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceEqualTo(String value) {
            addCriterion("betweenPrice =", value, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceNotEqualTo(String value) {
            addCriterion("betweenPrice <>", value, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceGreaterThan(String value) {
            addCriterion("betweenPrice >", value, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceGreaterThanOrEqualTo(String value) {
            addCriterion("betweenPrice >=", value, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceLessThan(String value) {
            addCriterion("betweenPrice <", value, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceLessThanOrEqualTo(String value) {
            addCriterion("betweenPrice <=", value, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceLike(String value) {
            addCriterion("betweenPrice like", value, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceNotLike(String value) {
            addCriterion("betweenPrice not like", value, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceIn(List<String> values) {
            addCriterion("betweenPrice in", values, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceNotIn(List<String> values) {
            addCriterion("betweenPrice not in", values, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceBetween(String value1, String value2) {
            addCriterion("betweenPrice between", value1, value2, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andBetweenpriceNotBetween(String value1, String value2) {
            addCriterion("betweenPrice not between", value1, value2, "betweenprice");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIsNull() {
            addCriterion("PhysicalState is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIsNotNull() {
            addCriterion("PhysicalState is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateEqualTo(String value) {
            addCriterion("PhysicalState =", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotEqualTo(String value) {
            addCriterion("PhysicalState <>", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateGreaterThan(String value) {
            addCriterion("PhysicalState >", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateGreaterThanOrEqualTo(String value) {
            addCriterion("PhysicalState >=", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLessThan(String value) {
            addCriterion("PhysicalState <", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLessThanOrEqualTo(String value) {
            addCriterion("PhysicalState <=", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLike(String value) {
            addCriterion("PhysicalState like", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotLike(String value) {
            addCriterion("PhysicalState not like", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIn(List<String> values) {
            addCriterion("PhysicalState in", values, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotIn(List<String> values) {
            addCriterion("PhysicalState not in", values, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateBetween(String value1, String value2) {
            addCriterion("PhysicalState between", value1, value2, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotBetween(String value1, String value2) {
            addCriterion("PhysicalState not between", value1, value2, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andStockdurationIsNull() {
            addCriterion("stockDuration is null");
            return (Criteria) this;
        }

        public Criteria andStockdurationIsNotNull() {
            addCriterion("stockDuration is not null");
            return (Criteria) this;
        }

        public Criteria andStockdurationEqualTo(String value) {
            addCriterion("stockDuration =", value, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationNotEqualTo(String value) {
            addCriterion("stockDuration <>", value, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationGreaterThan(String value) {
            addCriterion("stockDuration >", value, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationGreaterThanOrEqualTo(String value) {
            addCriterion("stockDuration >=", value, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationLessThan(String value) {
            addCriterion("stockDuration <", value, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationLessThanOrEqualTo(String value) {
            addCriterion("stockDuration <=", value, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationLike(String value) {
            addCriterion("stockDuration like", value, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationNotLike(String value) {
            addCriterion("stockDuration not like", value, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationIn(List<String> values) {
            addCriterion("stockDuration in", values, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationNotIn(List<String> values) {
            addCriterion("stockDuration not in", values, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationBetween(String value1, String value2) {
            addCriterion("stockDuration between", value1, value2, "stockduration");
            return (Criteria) this;
        }

        public Criteria andStockdurationNotBetween(String value1, String value2) {
            addCriterion("stockDuration not between", value1, value2, "stockduration");
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