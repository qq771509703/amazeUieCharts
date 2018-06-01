package com.example.xxf.bean;

public class TBaseDataAnalyzeSalebasedata {
    private String fcontracttime;

    private String fcontract;

    private String saleman;

    private String fdividendratio;

    private String salemoney;

    private String fplatenum;

    private String fbrand;

    private String cartype;

    private String fquotype;

    private String department;

    private String city;

    private String province;

    private String region;

    public String getFcontracttime() {
        return fcontracttime;
    }

    public void setFcontracttime(String fcontracttime) {
        this.fcontracttime = fcontracttime == null ? null : fcontracttime.trim();
    }

    public String getFcontract() {
        return fcontract;
    }

    public void setFcontract(String fcontract) {
        this.fcontract = fcontract == null ? null : fcontract.trim();
    }

    public String getSaleman() {
        return saleman;
    }

    public void setSaleman(String saleman) {
        this.saleman = saleman == null ? null : saleman.trim();
    }

    public String getFdividendratio() {
        return fdividendratio;
    }

    public void setFdividendratio(String fdividendratio) {
        this.fdividendratio = fdividendratio == null ? null : fdividendratio.trim();
    }

    public String getSalemoney() {
        return salemoney;
    }

    public void setSalemoney(String salemoney) {
        this.salemoney = salemoney == null ? null : salemoney.trim();
    }

    public String getFplatenum() {
        return fplatenum;
    }

    public void setFplatenum(String fplatenum) {
        this.fplatenum = fplatenum == null ? null : fplatenum.trim();
    }

    public String getFbrand() {
        return fbrand;
    }

    public void setFbrand(String fbrand) {
        this.fbrand = fbrand == null ? null : fbrand.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getFquotype() {
        return fquotype;
    }

    public void setFquotype(String fquotype) {
        this.fquotype = fquotype == null ? null : fquotype.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }
}