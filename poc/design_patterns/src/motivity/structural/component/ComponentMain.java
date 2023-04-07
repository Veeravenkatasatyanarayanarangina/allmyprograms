package motivity.structural.component;

public class ComponentMain
{
    public static void main(String[] args)
    {
        Component hd = new Leaf(5000,"HDD");
        Component mouse = new Leaf(1500,"mouse");
        Component monitor = new Leaf(8500,"Monitor");
        Component ram = new Leaf(6000,"RAM");
        Component  cpu =  new Leaf(10000,"cpu");

        Composite ph = new Composite("peri ");
        Composite cabinate = new Composite("Cabinate ");
        Composite mb = new Composite("Mother-Board ");
        Composite computer = new Composite("Computer ");

        mb.addComponents(cpu);
        mb.addComponents(ram);
        ph.addComponents(mouse);
        ph.addComponents(monitor);
        cabinate.addComponents(hd);
        cabinate.addComponents(mb);
        computer.addComponents(ph);
        computer.addComponents(cabinate);
        computer.showPrice();




    }
}
