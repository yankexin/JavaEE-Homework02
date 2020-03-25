package com.java.code.model;

import java.sql.Timestamp;
import java.util.Date;

public class stuhom {
    private long id;
    private long sid;
    private long hid;
    private String title;
    private String scontent;
    private String hcontent;
    private Date time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSId() {
        return sid;
    }

    public void setSId(long sid) {
        this.sid = sid;
    }

    public long getHId() {
        return hid;
    }

    public void setHId(long hid) {
        this.hid = hid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSContent() {
        return scontent;
    }

    public void setSContent(String scontent) {
        this.scontent = scontent;
    }

    public String getHContent() {
        return hcontent;
    }

    public void setHContent(String hcontent) {
        this.hcontent = hcontent;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Timestamp name) {
        this.time = time;
    }
}
