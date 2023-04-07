package lambdaex;

public class MobileStore
{
    private int mid;
    private String mname;
   private float price;


    public MobileStore(int mid, String mname, float price) {
        this.mid = mid;
        this.mname = mname;
        this.price = price;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
