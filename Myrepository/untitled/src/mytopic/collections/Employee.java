package mytopic.collections;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable
{
    private int eid;
    private String ename;
    private Date dob;
    private String department;
    private String designation;
    private double salary;

    public Employee(int eid, String ename, Date dob, String department, String designation, double salary) {
        this.eid = eid;
        this.ename = ename;
        this.dob = dob;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
