package com.mobilestore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "sid", nullable = false)
    private Integer id;

    @Column(name = "smarks")
    private Float smarks;

    @Column(name = "sname")
    private String sname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getSmarks() {
        return smarks;
    }

    public void setSmarks(Float smarks) {
        this.smarks = smarks;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

}