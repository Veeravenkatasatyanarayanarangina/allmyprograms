package org.example;

import javax.persistence.*;

@Entity
@Table(name = "Payment")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value = "payment")
public class Payment
{
    @Id
    @Column(name = "pid")
    private int pid;
    @Column(name = "amount")
    private  double amount;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
