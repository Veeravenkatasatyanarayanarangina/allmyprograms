package motivity.creational.builder;

public class BuilderMain
{
    public static void main(String[] args) {
        Animal a = new Lion().setLegs(4).setHeight(6).setWeight(97).getObject();
        System.out.println(a);

    }
}
