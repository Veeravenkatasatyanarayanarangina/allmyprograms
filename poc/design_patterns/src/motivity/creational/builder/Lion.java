package motivity.creational.builder;

public class Lion
{
    private int legs;
    private String name;
    private double weight;
    private float height;
    private char gender;

    public Lion setLegs(int legs) {
        this.legs = legs;
        return this;
    }
    public Lion setName(String name) {
        this.name = name;
        return this;
    }
    public Lion setWeight(double weight)
    {
        this.weight = weight;
        return this;
    }
    public Lion setHeight(float height)
    {
        this.height = height;
        return this;
    }
    public Lion setGender(char gender)
    {
        this.gender = gender;
        return this;
    }
    public Animal getObject()
    {
        return new Animal(this.legs,this.name,this.weight,this.height,this.gender);
    }
}
