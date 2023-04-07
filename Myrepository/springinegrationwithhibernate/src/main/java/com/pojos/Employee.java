package com.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
    @Id
    private  int eid;
    private String name;
    private String designation;
    private String dept;

    public Employee(int eid, String name, String designation, String dept) {
        this.eid = eid;
        this.name = name;
        this.designation = designation;
        this.dept = dept;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Employee() {
    }
}
