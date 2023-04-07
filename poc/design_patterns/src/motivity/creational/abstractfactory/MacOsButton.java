package motivity.creational.abstractfactory;

public class MacOsButton implements Button
{

    @Override
    public void create() {
        System.out.println("created macos button..........");
    }
}
