package com.gzk.pojo;

import java.util.Date;

public class Employee {
    private String eid;
    private String name;
    private Date startTime;
    private Manager manager;

    public Employee() {
    }

    public Employee(String eid, String name, Date startTime, Manager manager) {
        this.eid = eid;
        this.name = name;
        this.startTime = startTime;
        this.manager = manager;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", manager=" + manager +
                '}';
    }

}
