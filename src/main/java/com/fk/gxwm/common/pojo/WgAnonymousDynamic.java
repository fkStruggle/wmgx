package com.fk.gxwm.common.pojo;

import java.util.Date;

public class WgAnonymousDynamic {
    private Long dynamicid;

    private String userloginname;

    private String dynamicinfo;

    private String dynamicimg;

    private Date releasetime;

    public Long getDynamicid() {
        return dynamicid;
    }

    public void setDynamicid(Long dynamicid) {
        this.dynamicid = dynamicid;
    }

    public String getUserloginname() {
        return userloginname;
    }

    public void setUserloginname(String userloginname) {
        this.userloginname = userloginname;
    }

    public String getDynamicinfo() {
        return dynamicinfo;
    }

    public void setDynamicinfo(String dynamicinfo) {
        this.dynamicinfo = dynamicinfo;
    }

    public String getDynamicimg() {
        return dynamicimg;
    }

    public void setDynamicimg(String dynamicimg) {
        this.dynamicimg = dynamicimg;
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }
}