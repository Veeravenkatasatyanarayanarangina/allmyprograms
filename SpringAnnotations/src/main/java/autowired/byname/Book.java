package autowired.byname;

public class Book
{
    private int bid;
    private String bname;
    private int price;
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(int bid, String bname, int price) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
    }
}
