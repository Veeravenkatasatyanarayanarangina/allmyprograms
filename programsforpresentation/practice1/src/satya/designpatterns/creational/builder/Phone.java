package satya.designpatterns.creational.builder;

public class Phone
{
    private int sno;
    private String os;
    private String mobileName;
    private int ram;
    private double max_price;
    private int battery;

    public Phone(int sno, String os, String mobileName, int ram, double max_price, int battery) {
        this.sno = sno;
        this.os = os;
        this.mobileName = mobileName;
        this.ram = ram;
        this.max_price = max_price;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "sno=" + sno +
                ", os='" + os + '\'' +
                ", mobileName='" + mobileName + '\'' +
                ", ram=" + ram +
                ", max_price=" + max_price +
                ", battery=" + battery +
                '}';
    }
}
