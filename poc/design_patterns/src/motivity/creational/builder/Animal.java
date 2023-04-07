package motivity.creational.builder;

public class Animal
{
    private int legs;
    private String name;
    private double weight;
    private float height;
    private char gender;

    public Animal(int legs, String name, double weight, float height, char gender) {
        this.legs = legs;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
