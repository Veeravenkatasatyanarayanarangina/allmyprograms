package satya.designpatterns.creational.prototype;

public class Squere extends Shape
{
    public Squere()
    {
        type = "Squre";
    }
    @Override
    void draw() {
        System.out.println("inside the Squre :: draw method..");
    }
}
