package geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class GroceryMain
{
    public static void main(String[] args) {
        List<Grocery> g = new ArrayList<>();
        g.add(new Grocery(1,100));
        g.add(new Grocery(3,80));
        g.add(new Grocery(6,120));
        g.add(new Grocery(7,40));
        g.add(new Grocery(10,50));

    }

}
