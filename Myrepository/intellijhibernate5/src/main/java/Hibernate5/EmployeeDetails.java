package Hibernate5;

import javax.persistence.*;

@Entity
@Table(name = "employeedetails")
public class EmployeeDetails
{
    @Id
    @Column(name = "eid")
    @PrimaryKeyJoinColumn
    private int id;
    @Column(name = "ename")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "loc")
    private String loc;
    @Column(name = "designation")
    private String designation;
    @Column(name = "salary")
    private double salary;
    @Column(name = "exp")
    private  int exp;
    @OneToOne(targetEntity=Eaddress.class,cascade=CascadeType.ALL)
    private Eaddress address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Eaddress getAddress() {
        return address;
    }

    public void setAddress(Eaddress address) {
        this.address = address;
    }
}
