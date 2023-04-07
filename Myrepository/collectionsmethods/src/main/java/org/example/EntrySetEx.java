package org.example;

import java.util.*;

public class EntrySetEx
{
    public static void main(String[] args) throws InterruptedException {
        Map<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1045,"satya");
        tm.put(1023,"yamuna");
        tm.put(1024,"gayatri");
        tm.put(1027,"sindhu");
        tm.put(1034,"satya");
        System.out.println(tm);
        Set<Map.Entry<Integer,String>> es=tm.entrySet();
       /* Iterator<Map.Entry<Integer,String>> iterator = es.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer,String> e=iterator.next();
            System.out.println(e.getKey()+"  "+e.getValue());
        }
        for (Map.Entry<Integer,String > f1:es) {
            System.out.println(f1.getKey()+"  "+f1.getValue());
            
        }*/
        Spliterator<Map.Entry<Integer,String>> spl =  es.spliterator();
        spl.forEachRemaining((n) -> System.out.println(n));
        System.out.println(spl.getExactSizeIfKnown());
        System.out.println(spl.estimateSize());





    }
}
