package com.example.listviewexample;

import java.io.Serializable;

public class Student implements Serializable {
    String sid;
    String sname;
    String counrty;

    public Student(String sid, String sname, String counrty) {
        this.sid = sid;
        this.sname = sname;
        this.counrty = counrty;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCounrty() {
        return counrty;
    }

    public void setCounrty(String counrty) {
        this.counrty = counrty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", counrty='" + counrty + '\'' +
                '}';
    }
}
