package com.example.xxf.bean;

public class TBaseRole {
    private Integer id;

    private String cName;

    private String cCode;

    private String cCreatetime;

    private String cOrganization;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public String getcCreatetime() {
        return cCreatetime;
    }

    public void setcCreatetime(String cCreatetime) {
        this.cCreatetime = cCreatetime == null ? null : cCreatetime.trim();
    }

    public String getcOrganization() {
        return cOrganization;
    }

    public void setcOrganization(String cOrganization) {
        this.cOrganization = cOrganization == null ? null : cOrganization.trim();
    }
}