package com.example.xxf.bean;

public class PerformanceRecord {

    private String region;
    private String province;
    private String city;
    private String month_achievement;
    private String yesterday_achievement;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMonth_achievement() {
        return month_achievement;
    }

    public void setMonth_achievement(String month_achievement) {
        this.month_achievement = month_achievement;
    }

    public String getYesterday_achievement() {
        return yesterday_achievement;
    }

    public void setYesterday_achievement(String yesterday_achievement) {
        this.yesterday_achievement = yesterday_achievement;
    }
}