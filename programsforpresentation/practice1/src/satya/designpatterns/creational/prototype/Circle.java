package satya.designpatterns.creational.prototype;

public class Circle extends Shape
{
    public Circle()
    {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle :: draw Method...");
    }
}
