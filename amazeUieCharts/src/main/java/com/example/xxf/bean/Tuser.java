package com.example.xxf.bean;

import java.util.Date;

public class Tuser {
    private Long id;

    private String userid;

    private String password;

    private String name;

    private Long grade;

    private Date lastlogin;

    private Long logins;

    private Date chgpwdtime;

    private Long chgpwdlimit;

    private Long status;

    private String iplimit;

    private String certno;

    private Long orgid;

    private Integer userattribute;

    private Date femployed;

    private Long farea;

    private byte[] photo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Long getLogins() {
        return logins;
    }

    public void setLogins(Long logins) {
        this.logins = logins;
    }

    public Date getChgpwdtime() {
        return chgpwdtime;
    }

    public void setChgpwdtime(Date chgpwdtime) {
        this.chgpwdtime = chgpwdtime;
    }

    public Long getChgpwdlimit() {
        return chgpwdlimit;
    }

    public void setChgpwdlimit(Long chgpwdlimit) {
        this.chgpwdlimit = chgpwdlimit;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getIplimit() {
        return iplimit;
    }

    public void setIplimit(String iplimit) {
        this.iplimit = iplimit == null ? null : iplimit.trim();
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno == null ? null : certno.trim();
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Integer getUserattribute() {
        return userattribute;
    }

    public void setUserattribute(Integer userattribute) {
        this.userattribute = userattribute;
    }

    public Date getFemployed() {
        return femployed;
    }

    public void setFemployed(Date femployed) {
        this.femployed = femployed;
    }

    public Long getFarea() {
        return farea;
    }

    public void setFarea(Long farea) {
        this.farea = farea;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}