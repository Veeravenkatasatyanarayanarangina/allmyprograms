package motivity.structural.component;
import java.util.ArrayList;
import java.util.List;

public class Composite implements Component
{
    String name;
    List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c:componentList
             ) {
            c.showPrice();
        }
    }
    public void addComponents(Component c)
    {
        componentList.add(c);
    }

}
