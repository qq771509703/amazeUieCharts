package com.example.xxf.bean;

import java.util.ArrayList;
import java.util.List;

public class SynergyevolvetableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SynergyevolvetableExample() {
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

        public Criteria andOldidIsNull() {
            addCriterion("OldID is null");
            return (Criteria) this;
        }

        public Criteria andOldidIsNotNull() {
            addCriterion("OldID is not null");
            return (Criteria) this;
        }

        public Criteria andOldidEqualTo(Integer value) {
            addCriterion("OldID =", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotEqualTo(Integer value) {
            addCriterion("OldID <>", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidGreaterThan(Integer value) {
            addCriterion("OldID >", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OldID >=", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidLessThan(Integer value) {
            addCriterion("OldID <", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidLessThanOrEqualTo(Integer value) {
            addCriterion("OldID <=", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidIn(List<Integer> values) {
            addCriterion("OldID in", values, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotIn(List<Integer> values) {
            addCriterion("OldID not in", values, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidBetween(Integer value1, Integer value2) {
            addCriterion("OldID between", value1, value2, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotBetween(Integer value1, Integer value2) {
            addCriterion("OldID not between", value1, value2, "oldid");
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

        public Criteria andPurchaseorderIsNull() {
            addCriterion("purchaseOrder is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderIsNotNull() {
            addCriterion("purchaseOrder is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderEqualTo(String value) {
            addCriterion("purchaseOrder =", value, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderNotEqualTo(String value) {
            addCriterion("purchaseOrder <>", value, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderGreaterThan(String value) {
            addCriterion("purchaseOrder >", value, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseOrder >=", value, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderLessThan(String value) {
            addCriterion("purchaseOrder <", value, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderLessThanOrEqualTo(String value) {
            addCriterion("purchaseOrder <=", value, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderLike(String value) {
            addCriterion("purchaseOrder like", value, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderNotLike(String value) {
            addCriterion("purchaseOrder not like", value, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderIn(List<String> values) {
            addCriterion("purchaseOrder in", values, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderNotIn(List<String> values) {
            addCriterion("purchaseOrder not in", values, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderBetween(String value1, String value2) {
            addCriterion("purchaseOrder between", value1, value2, "purchaseorder");
            return (Criteria) this;
        }

        public Criteria andPurchaseorderNotBetween(String value1, String value2) {
            addCriterion("purchaseOrder not between", value1, value2, "purchaseorder");
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

        public Criteria andCarnumIsNull() {
            addCriterion("carNum is null");
            return (Criteria) this;
        }

        public Criteria andCarnumIsNotNull() {
            addCriterion("carNum is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumEqualTo(String value) {
            addCriterion("carNum =", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotEqualTo(String value) {
            addCriterion("carNum <>", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThan(String value) {
            addCriterion("carNum >", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumGreaterThanOrEqualTo(String value) {
            addCriterion("carNum >=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThan(String value) {
            addCriterion("carNum <", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLessThanOrEqualTo(String value) {
            addCriterion("carNum <=", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumLike(String value) {
            addCriterion("carNum like", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotLike(String value) {
            addCriterion("carNum not like", value, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumIn(List<String> values) {
            addCriterion("carNum in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotIn(List<String> values) {
            addCriterion("carNum not in", values, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumBetween(String value1, String value2) {
            addCriterion("carNum between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andCarnumNotBetween(String value1, String value2) {
            addCriterion("carNum not between", value1, value2, "carnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumIsNull() {
            addCriterion("purchaseTrackingNum is null");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumIsNotNull() {
            addCriterion("purchaseTrackingNum is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumEqualTo(String value) {
            addCriterion("purchaseTrackingNum =", value, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumNotEqualTo(String value) {
            addCriterion("purchaseTrackingNum <>", value, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumGreaterThan(String value) {
            addCriterion("purchaseTrackingNum >", value, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseTrackingNum >=", value, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumLessThan(String value) {
            addCriterion("purchaseTrackingNum <", value, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumLessThanOrEqualTo(String value) {
            addCriterion("purchaseTrackingNum <=", value, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumLike(String value) {
            addCriterion("purchaseTrackingNum like", value, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumNotLike(String value) {
            addCriterion("purchaseTrackingNum not like", value, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumIn(List<String> values) {
            addCriterion("purchaseTrackingNum in", values, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumNotIn(List<String> values) {
            addCriterion("purchaseTrackingNum not in", values, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumBetween(String value1, String value2) {
            addCriterion("purchaseTrackingNum between", value1, value2, "purchasetrackingnum");
            return (Criteria) this;
        }

        public Criteria andPurchasetrackingnumNotBetween(String value1, String value2) {
            addCriterion("purchaseTrackingNum not between", value1, value2, "purchasetrackingnum");
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

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateIsNull() {
            addCriterion("paymentEndDate is null");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateIsNotNull() {
            addCriterion("paymentEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateEqualTo(String value) {
            addCriterion("paymentEndDate =", value, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateNotEqualTo(String value) {
            addCriterion("paymentEndDate <>", value, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateGreaterThan(String value) {
            addCriterion("paymentEndDate >", value, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateGreaterThanOrEqualTo(String value) {
            addCriterion("paymentEndDate >=", value, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateLessThan(String value) {
            addCriterion("paymentEndDate <", value, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateLessThanOrEqualTo(String value) {
            addCriterion("paymentEndDate <=", value, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateLike(String value) {
            addCriterion("paymentEndDate like", value, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateNotLike(String value) {
            addCriterion("paymentEndDate not like", value, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateIn(List<String> values) {
            addCriterion("paymentEndDate in", values, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateNotIn(List<String> values) {
            addCriterion("paymentEndDate not in", values, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateBetween(String value1, String value2) {
            addCriterion("paymentEndDate between", value1, value2, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPaymentenddateNotBetween(String value1, String value2) {
            addCriterion("paymentEndDate not between", value1, value2, "paymentenddate");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarIsNull() {
            addCriterion("predictSendCar is null");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarIsNotNull() {
            addCriterion("predictSendCar is not null");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarEqualTo(String value) {
            addCriterion("predictSendCar =", value, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarNotEqualTo(String value) {
            addCriterion("predictSendCar <>", value, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarGreaterThan(String value) {
            addCriterion("predictSendCar >", value, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarGreaterThanOrEqualTo(String value) {
            addCriterion("predictSendCar >=", value, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarLessThan(String value) {
            addCriterion("predictSendCar <", value, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarLessThanOrEqualTo(String value) {
            addCriterion("predictSendCar <=", value, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarLike(String value) {
            addCriterion("predictSendCar like", value, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarNotLike(String value) {
            addCriterion("predictSendCar not like", value, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarIn(List<String> values) {
            addCriterion("predictSendCar in", values, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarNotIn(List<String> values) {
            addCriterion("predictSendCar not in", values, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarBetween(String value1, String value2) {
            addCriterion("predictSendCar between", value1, value2, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andPredictsendcarNotBetween(String value1, String value2) {
            addCriterion("predictSendCar not between", value1, value2, "predictsendcar");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffIsNull() {
            addCriterion("invoiceSendoff is null");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffIsNotNull() {
            addCriterion("invoiceSendoff is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffEqualTo(String value) {
            addCriterion("invoiceSendoff =", value, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffNotEqualTo(String value) {
            addCriterion("invoiceSendoff <>", value, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffGreaterThan(String value) {
            addCriterion("invoiceSendoff >", value, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceSendoff >=", value, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffLessThan(String value) {
            addCriterion("invoiceSendoff <", value, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffLessThanOrEqualTo(String value) {
            addCriterion("invoiceSendoff <=", value, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffLike(String value) {
            addCriterion("invoiceSendoff like", value, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffNotLike(String value) {
            addCriterion("invoiceSendoff not like", value, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffIn(List<String> values) {
            addCriterion("invoiceSendoff in", values, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffNotIn(List<String> values) {
            addCriterion("invoiceSendoff not in", values, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffBetween(String value1, String value2) {
            addCriterion("invoiceSendoff between", value1, value2, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andInvoicesendoffNotBetween(String value1, String value2) {
            addCriterion("invoiceSendoff not between", value1, value2, "invoicesendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffIsNull() {
            addCriterion("conformityCertificationSendoff is null");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffIsNotNull() {
            addCriterion("conformityCertificationSendoff is not null");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffEqualTo(String value) {
            addCriterion("conformityCertificationSendoff =", value, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffNotEqualTo(String value) {
            addCriterion("conformityCertificationSendoff <>", value, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffGreaterThan(String value) {
            addCriterion("conformityCertificationSendoff >", value, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffGreaterThanOrEqualTo(String value) {
            addCriterion("conformityCertificationSendoff >=", value, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffLessThan(String value) {
            addCriterion("conformityCertificationSendoff <", value, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffLessThanOrEqualTo(String value) {
            addCriterion("conformityCertificationSendoff <=", value, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffLike(String value) {
            addCriterion("conformityCertificationSendoff like", value, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffNotLike(String value) {
            addCriterion("conformityCertificationSendoff not like", value, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffIn(List<String> values) {
            addCriterion("conformityCertificationSendoff in", values, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffNotIn(List<String> values) {
            addCriterion("conformityCertificationSendoff not in", values, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffBetween(String value1, String value2) {
            addCriterion("conformityCertificationSendoff between", value1, value2, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andConformitycertificationsendoffNotBetween(String value1, String value2) {
            addCriterion("conformityCertificationSendoff not between", value1, value2, "conformitycertificationsendoff");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceIsNull() {
            addCriterion("commerceInsurance is null");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceIsNotNull() {
            addCriterion("commerceInsurance is not null");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceEqualTo(String value) {
            addCriterion("commerceInsurance =", value, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceNotEqualTo(String value) {
            addCriterion("commerceInsurance <>", value, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceGreaterThan(String value) {
            addCriterion("commerceInsurance >", value, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("commerceInsurance >=", value, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceLessThan(String value) {
            addCriterion("commerceInsurance <", value, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceLessThanOrEqualTo(String value) {
            addCriterion("commerceInsurance <=", value, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceLike(String value) {
            addCriterion("commerceInsurance like", value, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceNotLike(String value) {
            addCriterion("commerceInsurance not like", value, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceIn(List<String> values) {
            addCriterion("commerceInsurance in", values, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceNotIn(List<String> values) {
            addCriterion("commerceInsurance not in", values, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceBetween(String value1, String value2) {
            addCriterion("commerceInsurance between", value1, value2, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andCommerceinsuranceNotBetween(String value1, String value2) {
            addCriterion("commerceInsurance not between", value1, value2, "commerceinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceIsNull() {
            addCriterion("trafficInsurance is null");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceIsNotNull() {
            addCriterion("trafficInsurance is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceEqualTo(String value) {
            addCriterion("trafficInsurance =", value, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceNotEqualTo(String value) {
            addCriterion("trafficInsurance <>", value, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceGreaterThan(String value) {
            addCriterion("trafficInsurance >", value, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("trafficInsurance >=", value, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceLessThan(String value) {
            addCriterion("trafficInsurance <", value, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceLessThanOrEqualTo(String value) {
            addCriterion("trafficInsurance <=", value, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceLike(String value) {
            addCriterion("trafficInsurance like", value, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceNotLike(String value) {
            addCriterion("trafficInsurance not like", value, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceIn(List<String> values) {
            addCriterion("trafficInsurance in", values, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceNotIn(List<String> values) {
            addCriterion("trafficInsurance not in", values, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceBetween(String value1, String value2) {
            addCriterion("trafficInsurance between", value1, value2, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andTrafficinsuranceNotBetween(String value1, String value2) {
            addCriterion("trafficInsurance not between", value1, value2, "trafficinsurance");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreIsNull() {
            addCriterion("at4Sstore is null");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreIsNotNull() {
            addCriterion("at4Sstore is not null");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreEqualTo(String value) {
            addCriterion("at4Sstore =", value, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreNotEqualTo(String value) {
            addCriterion("at4Sstore <>", value, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreGreaterThan(String value) {
            addCriterion("at4Sstore >", value, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreGreaterThanOrEqualTo(String value) {
            addCriterion("at4Sstore >=", value, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreLessThan(String value) {
            addCriterion("at4Sstore <", value, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreLessThanOrEqualTo(String value) {
            addCriterion("at4Sstore <=", value, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreLike(String value) {
            addCriterion("at4Sstore like", value, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreNotLike(String value) {
            addCriterion("at4Sstore not like", value, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreIn(List<String> values) {
            addCriterion("at4Sstore in", values, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreNotIn(List<String> values) {
            addCriterion("at4Sstore not in", values, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreBetween(String value1, String value2) {
            addCriterion("at4Sstore between", value1, value2, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAt4sstoreNotBetween(String value1, String value2) {
            addCriterion("at4Sstore not between", value1, value2, "at4sstore");
            return (Criteria) this;
        }

        public Criteria andAtstoredateIsNull() {
            addCriterion("atStoreDate is null");
            return (Criteria) this;
        }

        public Criteria andAtstoredateIsNotNull() {
            addCriterion("atStoreDate is not null");
            return (Criteria) this;
        }

        public Criteria andAtstoredateEqualTo(String value) {
            addCriterion("atStoreDate =", value, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateNotEqualTo(String value) {
            addCriterion("atStoreDate <>", value, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateGreaterThan(String value) {
            addCriterion("atStoreDate >", value, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateGreaterThanOrEqualTo(String value) {
            addCriterion("atStoreDate >=", value, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateLessThan(String value) {
            addCriterion("atStoreDate <", value, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateLessThanOrEqualTo(String value) {
            addCriterion("atStoreDate <=", value, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateLike(String value) {
            addCriterion("atStoreDate like", value, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateNotLike(String value) {
            addCriterion("atStoreDate not like", value, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateIn(List<String> values) {
            addCriterion("atStoreDate in", values, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateNotIn(List<String> values) {
            addCriterion("atStoreDate not in", values, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateBetween(String value1, String value2) {
            addCriterion("atStoreDate between", value1, value2, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtstoredateNotBetween(String value1, String value2) {
            addCriterion("atStoreDate not between", value1, value2, "atstoredate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateIsNull() {
            addCriterion("atTicketDate is null");
            return (Criteria) this;
        }

        public Criteria andAtticketdateIsNotNull() {
            addCriterion("atTicketDate is not null");
            return (Criteria) this;
        }

        public Criteria andAtticketdateEqualTo(String value) {
            addCriterion("atTicketDate =", value, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateNotEqualTo(String value) {
            addCriterion("atTicketDate <>", value, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateGreaterThan(String value) {
            addCriterion("atTicketDate >", value, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateGreaterThanOrEqualTo(String value) {
            addCriterion("atTicketDate >=", value, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateLessThan(String value) {
            addCriterion("atTicketDate <", value, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateLessThanOrEqualTo(String value) {
            addCriterion("atTicketDate <=", value, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateLike(String value) {
            addCriterion("atTicketDate like", value, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateNotLike(String value) {
            addCriterion("atTicketDate not like", value, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateIn(List<String> values) {
            addCriterion("atTicketDate in", values, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateNotIn(List<String> values) {
            addCriterion("atTicketDate not in", values, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateBetween(String value1, String value2) {
            addCriterion("atTicketDate between", value1, value2, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtticketdateNotBetween(String value1, String value2) {
            addCriterion("atTicketDate not between", value1, value2, "atticketdate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateIsNull() {
            addCriterion("atCertificateDate is null");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateIsNotNull() {
            addCriterion("atCertificateDate is not null");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateEqualTo(String value) {
            addCriterion("atCertificateDate =", value, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateNotEqualTo(String value) {
            addCriterion("atCertificateDate <>", value, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateGreaterThan(String value) {
            addCriterion("atCertificateDate >", value, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateGreaterThanOrEqualTo(String value) {
            addCriterion("atCertificateDate >=", value, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateLessThan(String value) {
            addCriterion("atCertificateDate <", value, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateLessThanOrEqualTo(String value) {
            addCriterion("atCertificateDate <=", value, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateLike(String value) {
            addCriterion("atCertificateDate like", value, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateNotLike(String value) {
            addCriterion("atCertificateDate not like", value, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateIn(List<String> values) {
            addCriterion("atCertificateDate in", values, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateNotIn(List<String> values) {
            addCriterion("atCertificateDate not in", values, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateBetween(String value1, String value2) {
            addCriterion("atCertificateDate between", value1, value2, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andAtcertificatedateNotBetween(String value1, String value2) {
            addCriterion("atCertificateDate not between", value1, value2, "atcertificatedate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateIsNull() {
            addCriterion("GPSInstallDate is null");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateIsNotNull() {
            addCriterion("GPSInstallDate is not null");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateEqualTo(String value) {
            addCriterion("GPSInstallDate =", value, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateNotEqualTo(String value) {
            addCriterion("GPSInstallDate <>", value, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateGreaterThan(String value) {
            addCriterion("GPSInstallDate >", value, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateGreaterThanOrEqualTo(String value) {
            addCriterion("GPSInstallDate >=", value, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateLessThan(String value) {
            addCriterion("GPSInstallDate <", value, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateLessThanOrEqualTo(String value) {
            addCriterion("GPSInstallDate <=", value, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateLike(String value) {
            addCriterion("GPSInstallDate like", value, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateNotLike(String value) {
            addCriterion("GPSInstallDate not like", value, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateIn(List<String> values) {
            addCriterion("GPSInstallDate in", values, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateNotIn(List<String> values) {
            addCriterion("GPSInstallDate not in", values, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateBetween(String value1, String value2) {
            addCriterion("GPSInstallDate between", value1, value2, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andGpsinstalldateNotBetween(String value1, String value2) {
            addCriterion("GPSInstallDate not between", value1, value2, "gpsinstalldate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateIsNull() {
            addCriterion("installLicencePlate is null");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateIsNotNull() {
            addCriterion("installLicencePlate is not null");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateEqualTo(String value) {
            addCriterion("installLicencePlate =", value, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateNotEqualTo(String value) {
            addCriterion("installLicencePlate <>", value, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateGreaterThan(String value) {
            addCriterion("installLicencePlate >", value, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateGreaterThanOrEqualTo(String value) {
            addCriterion("installLicencePlate >=", value, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateLessThan(String value) {
            addCriterion("installLicencePlate <", value, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateLessThanOrEqualTo(String value) {
            addCriterion("installLicencePlate <=", value, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateLike(String value) {
            addCriterion("installLicencePlate like", value, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateNotLike(String value) {
            addCriterion("installLicencePlate not like", value, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateIn(List<String> values) {
            addCriterion("installLicencePlate in", values, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateNotIn(List<String> values) {
            addCriterion("installLicencePlate not in", values, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateBetween(String value1, String value2) {
            addCriterion("installLicencePlate between", value1, value2, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andInstalllicenceplateNotBetween(String value1, String value2) {
            addCriterion("installLicencePlate not between", value1, value2, "installlicenceplate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIsNull() {
            addCriterion("physicalState is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIsNotNull() {
            addCriterion("physicalState is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateEqualTo(String value) {
            addCriterion("physicalState =", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotEqualTo(String value) {
            addCriterion("physicalState <>", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateGreaterThan(String value) {
            addCriterion("physicalState >", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateGreaterThanOrEqualTo(String value) {
            addCriterion("physicalState >=", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLessThan(String value) {
            addCriterion("physicalState <", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLessThanOrEqualTo(String value) {
            addCriterion("physicalState <=", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateLike(String value) {
            addCriterion("physicalState like", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotLike(String value) {
            addCriterion("physicalState not like", value, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateIn(List<String> values) {
            addCriterion("physicalState in", values, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotIn(List<String> values) {
            addCriterion("physicalState not in", values, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateBetween(String value1, String value2) {
            addCriterion("physicalState between", value1, value2, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andPhysicalstateNotBetween(String value1, String value2) {
            addCriterion("physicalState not between", value1, value2, "physicalstate");
            return (Criteria) this;
        }

        public Criteria andAtstorewayIsNull() {
            addCriterion("atStoreWay is null");
            return (Criteria) this;
        }

        public Criteria andAtstorewayIsNotNull() {
            addCriterion("atStoreWay is not null");
            return (Criteria) this;
        }

        public Criteria andAtstorewayEqualTo(String value) {
            addCriterion("atStoreWay =", value, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayNotEqualTo(String value) {
            addCriterion("atStoreWay <>", value, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayGreaterThan(String value) {
            addCriterion("atStoreWay >", value, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayGreaterThanOrEqualTo(String value) {
            addCriterion("atStoreWay >=", value, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayLessThan(String value) {
            addCriterion("atStoreWay <", value, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayLessThanOrEqualTo(String value) {
            addCriterion("atStoreWay <=", value, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayLike(String value) {
            addCriterion("atStoreWay like", value, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayNotLike(String value) {
            addCriterion("atStoreWay not like", value, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayIn(List<String> values) {
            addCriterion("atStoreWay in", values, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayNotIn(List<String> values) {
            addCriterion("atStoreWay not in", values, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayBetween(String value1, String value2) {
            addCriterion("atStoreWay between", value1, value2, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andAtstorewayNotBetween(String value1, String value2) {
            addCriterion("atStoreWay not between", value1, value2, "atstoreway");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoIsNull() {
            addCriterion("procurementContractNo is null");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoIsNotNull() {
            addCriterion("procurementContractNo is not null");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoEqualTo(String value) {
            addCriterion("procurementContractNo =", value, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoNotEqualTo(String value) {
            addCriterion("procurementContractNo <>", value, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoGreaterThan(String value) {
            addCriterion("procurementContractNo >", value, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoGreaterThanOrEqualTo(String value) {
            addCriterion("procurementContractNo >=", value, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoLessThan(String value) {
            addCriterion("procurementContractNo <", value, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoLessThanOrEqualTo(String value) {
            addCriterion("procurementContractNo <=", value, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoLike(String value) {
            addCriterion("procurementContractNo like", value, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoNotLike(String value) {
            addCriterion("procurementContractNo not like", value, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoIn(List<String> values) {
            addCriterion("procurementContractNo in", values, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoNotIn(List<String> values) {
            addCriterion("procurementContractNo not in", values, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoBetween(String value1, String value2) {
            addCriterion("procurementContractNo between", value1, value2, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andProcurementcontractnoNotBetween(String value1, String value2) {
            addCriterion("procurementContractNo not between", value1, value2, "procurementcontractno");
            return (Criteria) this;
        }

        public Criteria andPaymentorderIsNull() {
            addCriterion("paymentOrder is null");
            return (Criteria) this;
        }

        public Criteria andPaymentorderIsNotNull() {
            addCriterion("paymentOrder is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentorderEqualTo(String value) {
            addCriterion("paymentOrder =", value, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderNotEqualTo(String value) {
            addCriterion("paymentOrder <>", value, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderGreaterThan(String value) {
            addCriterion("paymentOrder >", value, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderGreaterThanOrEqualTo(String value) {
            addCriterion("paymentOrder >=", value, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderLessThan(String value) {
            addCriterion("paymentOrder <", value, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderLessThanOrEqualTo(String value) {
            addCriterion("paymentOrder <=", value, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderLike(String value) {
            addCriterion("paymentOrder like", value, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderNotLike(String value) {
            addCriterion("paymentOrder not like", value, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderIn(List<String> values) {
            addCriterion("paymentOrder in", values, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderNotIn(List<String> values) {
            addCriterion("paymentOrder not in", values, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderBetween(String value1, String value2) {
            addCriterion("paymentOrder between", value1, value2, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andPaymentorderNotBetween(String value1, String value2) {
            addCriterion("paymentOrder not between", value1, value2, "paymentorder");
            return (Criteria) this;
        }

        public Criteria andGuidepriceIsNull() {
            addCriterion("guidePrice is null");
            return (Criteria) this;
        }

        public Criteria andGuidepriceIsNotNull() {
            addCriterion("guidePrice is not null");
            return (Criteria) this;
        }

        public Criteria andGuidepriceEqualTo(String value) {
            addCriterion("guidePrice =", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceNotEqualTo(String value) {
            addCriterion("guidePrice <>", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceGreaterThan(String value) {
            addCriterion("guidePrice >", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceGreaterThanOrEqualTo(String value) {
            addCriterion("guidePrice >=", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceLessThan(String value) {
            addCriterion("guidePrice <", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceLessThanOrEqualTo(String value) {
            addCriterion("guidePrice <=", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceLike(String value) {
            addCriterion("guidePrice like", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceNotLike(String value) {
            addCriterion("guidePrice not like", value, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceIn(List<String> values) {
            addCriterion("guidePrice in", values, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceNotIn(List<String> values) {
            addCriterion("guidePrice not in", values, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceBetween(String value1, String value2) {
            addCriterion("guidePrice between", value1, value2, "guideprice");
            return (Criteria) this;
        }

        public Criteria andGuidepriceNotBetween(String value1, String value2) {
            addCriterion("guidePrice not between", value1, value2, "guideprice");
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