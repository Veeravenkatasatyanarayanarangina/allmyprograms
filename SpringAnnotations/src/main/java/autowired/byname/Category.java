package autowired.byname;

import org.springframework.beans.factory.annotation.Autowired;

public class Category
{
    private String cname;

    @Autowired
    private Book java;
    public String getCname() {
        return cname;
    }

    public Category(String cname) {
        this.cname = cname;

    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Book getJava() {
        return java;
    }

    public void setJava(Book java) {
        this.java = java;
    }

}
