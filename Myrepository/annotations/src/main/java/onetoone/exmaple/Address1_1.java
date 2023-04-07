package onetoone.exmaple;

import javax.persistence.*;

@Entity
@Table(name = "address1_1")
public class Address1_1
{
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
  private String addressLine1,cit,state,country;
  private int pincode;

  @OneToOne(targetEntity = EmployeeOneToOne.class)
    private EmployeeOneToOne employeeOneToOne;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCit() {
        return cit;
    }

    public void setCit(String cit) {
        this.cit = cit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public EmployeeOneToOne getEmployeeOneToOne() {
        return employeeOneToOne;
    }

    public void setEmployeeOneToOne(EmployeeOneToOne employeeOneToOne) {
        this.employeeOneToOne = employeeOneToOne;
    }
}
