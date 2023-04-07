package satya.designpatterns.creational.prototype;

import java.util.Hashtable;

public class ShapeCache
{
    private static Hashtable<String,Shape> shapemap = new Hashtable<>();

    public static  Shape getShape(String shapeId)
    {
        Shape cashedShape = shapemap.get(shapeId);
        return (Shape) cashedShape.clone();
    }
    public static void loadCache()
    {
        Circle circle = new Circle();
        circle.setId("1");
        shapemap.put(circle.getId(), circle);

        Squere squere = new Squere();
        squere.setId("2");
        shapemap.put(squere.getId(), squere);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapemap.put(rectangle.getId(), rectangle);
    }
}
