package com.example.xxf.bean;

import java.util.Date;

public class Lborganization {
    private Long id;

    private Long fid;

    private Long grade;

    private Long type;

    private Long orgtype;

    private String orgcode;

    public  String name;

    private String describe;

    private String fdncode;

    private String bs;

    private Long fstate;

    private Date stopdate;

    private Long pernum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(Long orgtype) {
        this.orgtype = orgtype;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getFdncode() {
        return fdncode;
    }

    public void setFdncode(String fdncode) {
        this.fdncode = fdncode == null ? null : fdncode.trim();
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs == null ? null : bs.trim();
    }

    public Long getFstate() {
        return fstate;
    }

    public void setFstate(Long fstate) {
        this.fstate = fstate;
    }

    public Date getStopdate() {
        return stopdate;
    }

    public void setStopdate(Date stopdate) {
        this.stopdate = stopdate;
    }

    public Long getPernum() {
        return pernum;
    }

    public void setPernum(Long pernum) {
        this.pernum = pernum;
    }
}