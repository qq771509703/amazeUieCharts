package com.example.xxf.bean;

public class Forsalecardetail {
    private Integer id;

    private String area;

    private String oldid;

    private String caraffiliation;

    private String vin;

    private String platenum;

    private String brand;

    private String cartype;

    private String model;

    private String betweenprice;

    private String physicalstate;

    private String stockduration;

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

    public String getOldid() {
        return oldid;
    }

    public void setOldid(String oldid) {
        this.oldid = oldid == null ? null : oldid.trim();
    }

    public String getCaraffiliation() {
        return caraffiliation;
    }

    public void setCaraffiliation(String caraffiliation) {
        this.caraffiliation = caraffiliation == null ? null : caraffiliation.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public String getPlatenum() {
        return platenum;
    }

    public void setPlatenum(String platenum) {
        this.platenum = platenum == null ? null : platenum.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getBetweenprice() {
        return betweenprice;
    }

    public void setBetweenprice(String betweenprice) {
        this.betweenprice = betweenprice == null ? null : betweenprice.trim();
    }

    public String getPhysicalstate() {
        return physicalstate;
    }

    public void setPhysicalstate(String physicalstate) {
        this.physicalstate = physicalstate == null ? null : physicalstate.trim();
    }

    public String getStockduration() {
        return stockduration;
    }

    public void setStockduration(String stockduration) {
        this.stockduration = stockduration == null ? null : stockduration.trim();
    }
}