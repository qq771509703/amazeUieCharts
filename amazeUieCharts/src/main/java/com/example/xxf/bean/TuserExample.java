package com.example.xxf.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TuserExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Long value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Long value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Long value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Long value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Long value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Long value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Long> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Long> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Long value1, Long value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Long value1, Long value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("LastLogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("LastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Date value) {
            addCriterion("LastLogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Date value) {
            addCriterion("LastLogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Date value) {
            addCriterion("LastLogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Date value) {
            addCriterion("LastLogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Date value) {
            addCriterion("LastLogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Date> values) {
            addCriterion("LastLogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Date> values) {
            addCriterion("LastLogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Date value1, Date value2) {
            addCriterion("LastLogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Date value1, Date value2) {
            addCriterion("LastLogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLoginsIsNull() {
            addCriterion("Logins is null");
            return (Criteria) this;
        }

        public Criteria andLoginsIsNotNull() {
            addCriterion("Logins is not null");
            return (Criteria) this;
        }

        public Criteria andLoginsEqualTo(Long value) {
            addCriterion("Logins =", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotEqualTo(Long value) {
            addCriterion("Logins <>", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsGreaterThan(Long value) {
            addCriterion("Logins >", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsGreaterThanOrEqualTo(Long value) {
            addCriterion("Logins >=", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsLessThan(Long value) {
            addCriterion("Logins <", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsLessThanOrEqualTo(Long value) {
            addCriterion("Logins <=", value, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsIn(List<Long> values) {
            addCriterion("Logins in", values, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotIn(List<Long> values) {
            addCriterion("Logins not in", values, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsBetween(Long value1, Long value2) {
            addCriterion("Logins between", value1, value2, "logins");
            return (Criteria) this;
        }

        public Criteria andLoginsNotBetween(Long value1, Long value2) {
            addCriterion("Logins not between", value1, value2, "logins");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeIsNull() {
            addCriterion("ChgPwdTime is null");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeIsNotNull() {
            addCriterion("ChgPwdTime is not null");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeEqualTo(Date value) {
            addCriterion("ChgPwdTime =", value, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeNotEqualTo(Date value) {
            addCriterion("ChgPwdTime <>", value, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeGreaterThan(Date value) {
            addCriterion("ChgPwdTime >", value, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ChgPwdTime >=", value, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeLessThan(Date value) {
            addCriterion("ChgPwdTime <", value, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeLessThanOrEqualTo(Date value) {
            addCriterion("ChgPwdTime <=", value, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeIn(List<Date> values) {
            addCriterion("ChgPwdTime in", values, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeNotIn(List<Date> values) {
            addCriterion("ChgPwdTime not in", values, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeBetween(Date value1, Date value2) {
            addCriterion("ChgPwdTime between", value1, value2, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdtimeNotBetween(Date value1, Date value2) {
            addCriterion("ChgPwdTime not between", value1, value2, "chgpwdtime");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitIsNull() {
            addCriterion("ChgPwdLimit is null");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitIsNotNull() {
            addCriterion("ChgPwdLimit is not null");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitEqualTo(Long value) {
            addCriterion("ChgPwdLimit =", value, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitNotEqualTo(Long value) {
            addCriterion("ChgPwdLimit <>", value, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitGreaterThan(Long value) {
            addCriterion("ChgPwdLimit >", value, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitGreaterThanOrEqualTo(Long value) {
            addCriterion("ChgPwdLimit >=", value, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitLessThan(Long value) {
            addCriterion("ChgPwdLimit <", value, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitLessThanOrEqualTo(Long value) {
            addCriterion("ChgPwdLimit <=", value, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitIn(List<Long> values) {
            addCriterion("ChgPwdLimit in", values, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitNotIn(List<Long> values) {
            addCriterion("ChgPwdLimit not in", values, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitBetween(Long value1, Long value2) {
            addCriterion("ChgPwdLimit between", value1, value2, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andChgpwdlimitNotBetween(Long value1, Long value2) {
            addCriterion("ChgPwdLimit not between", value1, value2, "chgpwdlimit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIplimitIsNull() {
            addCriterion("IPLimit is null");
            return (Criteria) this;
        }

        public Criteria andIplimitIsNotNull() {
            addCriterion("IPLimit is not null");
            return (Criteria) this;
        }

        public Criteria andIplimitEqualTo(String value) {
            addCriterion("IPLimit =", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitNotEqualTo(String value) {
            addCriterion("IPLimit <>", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitGreaterThan(String value) {
            addCriterion("IPLimit >", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitGreaterThanOrEqualTo(String value) {
            addCriterion("IPLimit >=", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitLessThan(String value) {
            addCriterion("IPLimit <", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitLessThanOrEqualTo(String value) {
            addCriterion("IPLimit <=", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitLike(String value) {
            addCriterion("IPLimit like", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitNotLike(String value) {
            addCriterion("IPLimit not like", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitIn(List<String> values) {
            addCriterion("IPLimit in", values, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitNotIn(List<String> values) {
            addCriterion("IPLimit not in", values, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitBetween(String value1, String value2) {
            addCriterion("IPLimit between", value1, value2, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitNotBetween(String value1, String value2) {
            addCriterion("IPLimit not between", value1, value2, "iplimit");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNull() {
            addCriterion("CertNo is null");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNotNull() {
            addCriterion("CertNo is not null");
            return (Criteria) this;
        }

        public Criteria andCertnoEqualTo(String value) {
            addCriterion("CertNo =", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotEqualTo(String value) {
            addCriterion("CertNo <>", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThan(String value) {
            addCriterion("CertNo >", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThanOrEqualTo(String value) {
            addCriterion("CertNo >=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThan(String value) {
            addCriterion("CertNo <", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThanOrEqualTo(String value) {
            addCriterion("CertNo <=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLike(String value) {
            addCriterion("CertNo like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotLike(String value) {
            addCriterion("CertNo not like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoIn(List<String> values) {
            addCriterion("CertNo in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotIn(List<String> values) {
            addCriterion("CertNo not in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoBetween(String value1, String value2) {
            addCriterion("CertNo between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotBetween(String value1, String value2) {
            addCriterion("CertNo not between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("OrgID is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("OrgID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Long value) {
            addCriterion("OrgID =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Long value) {
            addCriterion("OrgID <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Long value) {
            addCriterion("OrgID >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Long value) {
            addCriterion("OrgID >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Long value) {
            addCriterion("OrgID <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Long value) {
            addCriterion("OrgID <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Long> values) {
            addCriterion("OrgID in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Long> values) {
            addCriterion("OrgID not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Long value1, Long value2) {
            addCriterion("OrgID between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Long value1, Long value2) {
            addCriterion("OrgID not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andUserattributeIsNull() {
            addCriterion("UserAttribute is null");
            return (Criteria) this;
        }

        public Criteria andUserattributeIsNotNull() {
            addCriterion("UserAttribute is not null");
            return (Criteria) this;
        }

        public Criteria andUserattributeEqualTo(Integer value) {
            addCriterion("UserAttribute =", value, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeNotEqualTo(Integer value) {
            addCriterion("UserAttribute <>", value, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeGreaterThan(Integer value) {
            addCriterion("UserAttribute >", value, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserAttribute >=", value, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeLessThan(Integer value) {
            addCriterion("UserAttribute <", value, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeLessThanOrEqualTo(Integer value) {
            addCriterion("UserAttribute <=", value, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeIn(List<Integer> values) {
            addCriterion("UserAttribute in", values, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeNotIn(List<Integer> values) {
            addCriterion("UserAttribute not in", values, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeBetween(Integer value1, Integer value2) {
            addCriterion("UserAttribute between", value1, value2, "userattribute");
            return (Criteria) this;
        }

        public Criteria andUserattributeNotBetween(Integer value1, Integer value2) {
            addCriterion("UserAttribute not between", value1, value2, "userattribute");
            return (Criteria) this;
        }

        public Criteria andFemployedIsNull() {
            addCriterion("Femployed is null");
            return (Criteria) this;
        }

        public Criteria andFemployedIsNotNull() {
            addCriterion("Femployed is not null");
            return (Criteria) this;
        }

        public Criteria andFemployedEqualTo(Date value) {
            addCriterion("Femployed =", value, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedNotEqualTo(Date value) {
            addCriterion("Femployed <>", value, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedGreaterThan(Date value) {
            addCriterion("Femployed >", value, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedGreaterThanOrEqualTo(Date value) {
            addCriterion("Femployed >=", value, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedLessThan(Date value) {
            addCriterion("Femployed <", value, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedLessThanOrEqualTo(Date value) {
            addCriterion("Femployed <=", value, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedIn(List<Date> values) {
            addCriterion("Femployed in", values, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedNotIn(List<Date> values) {
            addCriterion("Femployed not in", values, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedBetween(Date value1, Date value2) {
            addCriterion("Femployed between", value1, value2, "femployed");
            return (Criteria) this;
        }

        public Criteria andFemployedNotBetween(Date value1, Date value2) {
            addCriterion("Femployed not between", value1, value2, "femployed");
            return (Criteria) this;
        }

        public Criteria andFareaIsNull() {
            addCriterion("Farea is null");
            return (Criteria) this;
        }

        public Criteria andFareaIsNotNull() {
            addCriterion("Farea is not null");
            return (Criteria) this;
        }

        public Criteria andFareaEqualTo(Long value) {
            addCriterion("Farea =", value, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaNotEqualTo(Long value) {
            addCriterion("Farea <>", value, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaGreaterThan(Long value) {
            addCriterion("Farea >", value, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaGreaterThanOrEqualTo(Long value) {
            addCriterion("Farea >=", value, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaLessThan(Long value) {
            addCriterion("Farea <", value, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaLessThanOrEqualTo(Long value) {
            addCriterion("Farea <=", value, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaIn(List<Long> values) {
            addCriterion("Farea in", values, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaNotIn(List<Long> values) {
            addCriterion("Farea not in", values, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaBetween(Long value1, Long value2) {
            addCriterion("Farea between", value1, value2, "farea");
            return (Criteria) this;
        }

        public Criteria andFareaNotBetween(Long value1, Long value2) {
            addCriterion("Farea not between", value1, value2, "farea");
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