package interfaceex;

public class Employee
{
    private int eid;
    private String ename;
    private String dept;
    final String COMPANY_NAME = "Motivity";
    public Employee(int eid, String ename, String dept) {
        this.eid = eid;
        this.ename = ename;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", dept='" + dept + '\'' +
                ", COMPANY_NAME='" + COMPANY_NAME + '\'' +
                '}';
    }
}
