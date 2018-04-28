package com.example.xxf.bean;

public class TBaseDataAnalyzeAccountRole {
    private Integer id;

    private String cRolecode;

    private String cAccount;

    private String cCreatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcRolecode() {
        return cRolecode;
    }

    public void setcRolecode(String cRolecode) {
        this.cRolecode = cRolecode == null ? null : cRolecode.trim();
    }

    public String getcAccount() {
        return cAccount;
    }

    public void setcAccount(String cAccount) {
        this.cAccount = cAccount == null ? null : cAccount.trim();
    }

    public String getcCreatetime() {
        return cCreatetime;
    }

    public void setcCreatetime(String cCreatetime) {
        this.cCreatetime = cCreatetime == null ? null : cCreatetime.trim();
    }
}