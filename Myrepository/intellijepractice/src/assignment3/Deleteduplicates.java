package assignment3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Deleteduplicates
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(22);
        LinkedList<Integer> list2 =new LinkedList<Integer>();
        for (int i=0;i<list.size();i++)
        {
            if(! list2.contains(list.get(i)))
            {
                list2.add(list.get(i));
            }

        }
        System.out.println("main list "+list);
        Set <Integer> set = new LinkedHashSet<>();
        set.addAll(list);
        System.out.println("using list : "+list2);
        System.out.println("using set : "+set);

    }
}
