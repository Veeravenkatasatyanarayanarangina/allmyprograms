package org.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Stdent
{
    @Id
    @Column(name = "sid")
    private int sid;
    @Column(name = "sname")
    private String sname;
    @Column(name = "smarks")
    private float smarks;

    public Stdent() {

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public float getSmarks() {
        return smarks;
    }

    public void setSmarks(float smarks) {
        this.smarks = smarks;
    }

    public Stdent(int sid, String sname, float smarks) {
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
    }


    public String getStudent() {
        return "Stdent{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", smarks=" + smarks +
                '}';
    }
}
