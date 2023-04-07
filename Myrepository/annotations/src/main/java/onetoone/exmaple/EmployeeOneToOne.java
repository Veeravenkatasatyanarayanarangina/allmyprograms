package onetoone.exmaple;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import javax.persistence.*;

@Entity
@Table(name = "Employee1_1")
public class EmployeeOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private int employeeId;
    private String ename;
    private String email;

    @OneToOne(targetEntity = Address1_1.class, cascade = CascadeType.ALL)
    private Address1_1 address;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address1_1 getAddress() {
        return address;
    }

    public void setAddress(Address1_1 address) {
        this.address = address;
    }
}