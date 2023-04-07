package com.hibernate.practice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TicketDetails
{
    @Id
    private String tid;
    private String seatNo;
    private String name;
    private String age;
    private String phNo;
    private String mailId;
    private String jDate;
    private String date;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getjDate() {
        return jDate;
    }

    public void setjDate(String jDate) {
        this.jDate = jDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TicketDetails() {
        super();
    }

    public TicketDetails(String tid, String seatNo, String name, String age, String phNo, String mailId, String jDate, String date) {
        this.tid = tid;
        this.seatNo = seatNo;
        this.name = name;
        this.age = age;
        this.phNo = phNo;
        this.mailId = mailId;
        this.jDate = jDate;
        this.date = date;
    }

    @Override
    public String toString() {
        return "TicketDetails{" +
                "tid='" + tid + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phNo='" + phNo + '\'' +
                ", mailId='" + mailId + '\'' +
                ", jDate='" + jDate + '\'' +
                ", date=" + date +
                '}';
    }
}
