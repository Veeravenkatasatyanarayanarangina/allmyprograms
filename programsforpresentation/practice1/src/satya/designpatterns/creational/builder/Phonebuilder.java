package satya.designpatterns.creational.builder;


public class Phonebuilder
{
    private int sno;
    private String os;
    private String mobileName;
    private int ram;
    private double max_price;
    private int battery;

    public Phonebuilder setSno(int sno) {
        this.sno = sno;
        return this;
    }

    public Phonebuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Phonebuilder setMobileName(String mobileName) {
        this.mobileName = mobileName;
        return this;
    }

    public Phonebuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phonebuilder setMax_price(double max_price) {
        this.max_price = max_price;
        return this;
    }

    public Phonebuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone(sno,os,mobileName,ram,max_price,battery);
    }

}
