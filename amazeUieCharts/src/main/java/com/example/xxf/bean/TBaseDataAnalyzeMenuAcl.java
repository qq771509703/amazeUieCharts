package com.example.xxf.bean;

public class TBaseDataAnalyzeMenuAcl {
    private Integer id;

    private Integer cType;

    private String cCode;

    private Integer cMenuid;

    private String cPerioddate;

    private Integer cOpttype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getcType() {
        return cType;
    }

    public void setcType(Integer cType) {
        this.cType = cType;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public Integer getcMenuid() {
        return cMenuid;
    }

    public void setcMenuid(Integer cMenuid) {
        this.cMenuid = cMenuid;
    }

    public String getcPerioddate() {
        return cPerioddate;
    }

    public void setcPerioddate(String cPerioddate) {
        this.cPerioddate = cPerioddate == null ? null : cPerioddate.trim();
    }

    public Integer getcOpttype() {
        return cOpttype;
    }

    public void setcOpttype(Integer cOpttype) {
        this.cOpttype = cOpttype;
    }
}