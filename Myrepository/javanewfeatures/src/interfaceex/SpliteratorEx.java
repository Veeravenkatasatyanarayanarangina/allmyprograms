package interfaceex;

import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpliteratorEx
{
    public static void main(String[] args) {
        List<Integer> li = new LinkedList<Integer>() ;
        li.add(1);
        li.add(22);
        li.add(24);
        li.add(45);
        li.add(54);
        li.add(78);
        li.add(78);

        Stream<Integer> str = li.stream();
        Spliterator<Integer> k = str.spliterator();
        k.forEachRemaining(System.out::println);


    }
}
