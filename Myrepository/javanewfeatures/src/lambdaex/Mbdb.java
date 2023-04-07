package lambdaex;

import interfaceex.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Mbdb
{
    public static void main(String[] args) {
        List<MobileStore> mb = new ArrayList<>();
        mb.add(new MobileStore(1,"samsung",45000f));
        mb.add(new MobileStore(2,"poco",25000f));
        mb.add(new MobileStore(3,"mi",35000f));
        mb.add(new MobileStore(4,"oneplus",700000f));
        mb.add(new MobileStore(3,"oneplus",45000f));

        Stream<MobileStore> str = mb.stream().filter( p->p.getPrice()<50000f).distinct();
        str.forEach(request -> {
            System.out.println(request.getMid()+"  "+request.getMname()+"  "+request.getPrice());
        });
        System.out.println("below is split iterator........");
        Spliterator<MobileStore> splt1 = mb.spliterator();
        Spliterator<MobileStore> splt2 = splt1.trySplit();

        splt1.forEachRemaining(n -> System.out.println(n.getMid()));
        System.out.println("(-: =============== :-)");
        splt2.forEachRemaining(n -> System.out.println(n.getMid()));


    }


}
