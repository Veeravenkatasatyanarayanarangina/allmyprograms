package satya.designpatterns.creational.abstractfactory;

abstract public class  ViewModel  implements Building
{

    @Override
    public void display() {
        System.out.println("this is bulding Display.............");
    }
    abstract public void buildingmodel();
    abstract public void buildingcolor();
}
