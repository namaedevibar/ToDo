package com.activity.devibarsantillan.todo;

/**
 * Created by namai on 12/13/2016.
 */

public class Task {

    private String title;
    private String desc;
    private String date;
    private String time;
    private String status;

    public Task(String title, String desc, String date, String time, String status) {
        this.title = title;
        this.desc = desc;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
