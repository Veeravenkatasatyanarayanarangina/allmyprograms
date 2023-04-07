package com.motivity.springexample1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
        @NamedQuery(name = "Employee.findByAnameOrderByAidAsc", query = "select e from Employee e where e.aname = :aname order by e.aid")
})
public class Employee {
    @Id
    private int aid;
    private    String aname;
    private   int  age;
   private String company;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company=company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }
}

