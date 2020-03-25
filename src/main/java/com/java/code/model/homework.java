package com.java.code.model;

import java.sql.Timestamp;
import java.util.Date;

public class homework {
    private long id;
    private String title;
    private String content;
    private Date time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Timestamp name) {
        this.time = time;
    }
}
