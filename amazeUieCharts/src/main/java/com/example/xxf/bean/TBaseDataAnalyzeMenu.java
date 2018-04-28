package com.example.xxf.bean;

public class TBaseDataAnalyzeMenu {
    private Integer id;

    private String cIcon;

    private String cTitle;

    private String cUrl;

    private Integer cParentid;

    private Integer cLevel;

    private Integer cUseable;

    private String cModelname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcIcon() {
        return cIcon;
    }

    public void setcIcon(String cIcon) {
        this.cIcon = cIcon == null ? null : cIcon.trim();
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle == null ? null : cTitle.trim();
    }

    public String getcUrl() {
        return cUrl;
    }

    public void setcUrl(String cUrl) {
        this.cUrl = cUrl == null ? null : cUrl.trim();
    }

    public Integer getcParentid() {
        return cParentid;
    }

    public void setcParentid(Integer cParentid) {
        this.cParentid = cParentid;
    }

    public Integer getcLevel() {
        return cLevel;
    }

    public void setcLevel(Integer cLevel) {
        this.cLevel = cLevel;
    }

    public Integer getcUseable() {
        return cUseable;
    }

    public void setcUseable(Integer cUseable) {
        this.cUseable = cUseable;
    }

    public String getcModelname() {
        return cModelname;
    }

    public void setcModelname(String cModelname) {
        this.cModelname = cModelname == null ? null : cModelname.trim();
    }
}