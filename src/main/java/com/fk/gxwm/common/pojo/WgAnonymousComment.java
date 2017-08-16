package com.fk.gxwm.common.pojo;

import java.util.Date;

public class WgAnonymousComment {
    private Long acommentid;

    private Long aparentcomid;

    private Long dynamicid;

    private Long userid;

    private String cconten;

    private Date ctime;
    //匿名
    private String amousName;

    public Long getAcommentid() {
        return acommentid;
    }

    public void setAcommentid(Long acommentid) {
        this.acommentid = acommentid;
    }

    public Long getAparentcomid() {
        return aparentcomid;
    }

    public void setAparentcomid(Long aparentcomid) {
        this.aparentcomid = aparentcomid;
    }

    public Long getDynamicid() {
        return dynamicid;
    }

    public void setDynamicid(Long dynamicid) {
        this.dynamicid = dynamicid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getCconten() {
        return cconten;
    }

    public void setCconten(String cconten) {
        this.cconten = cconten;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

	public String getAmousName() {
		return amousName;
	}

	public void setAmousName(String amousName) {
		this.amousName = amousName;
	}
    
}