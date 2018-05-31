package com.example.xxf.bean;

public class Forsalecarbase {
    private Integer id;

    private String area;

    private String forsalenewcar;

    private String forsaleusedcar;

    private String summary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getForsalenewcar() {
        return forsalenewcar;
    }

    public void setForsalenewcar(String forsalenewcar) {
        this.forsalenewcar = forsalenewcar == null ? null : forsalenewcar.trim();
    }

    public String getForsaleusedcar() {
        return forsaleusedcar;
    }

    public void setForsaleusedcar(String forsaleusedcar) {
        this.forsaleusedcar = forsaleusedcar == null ? null : forsaleusedcar.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}