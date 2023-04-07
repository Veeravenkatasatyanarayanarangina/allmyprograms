package mytopic.collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEx
{
    public static void main(String[] args) {
        Map<Integer,String> m1 = new TreeMap<>();
        m1.put(1,"satya");
        m1.put(3,"sai");
        m1.put(2,"abhi");
        m1.put(4,"noor");
        System.out.println(m1);
        Map<Integer,Object> m2 = new TreeMap<>();
        Set<String> s1 = new HashSet<>();
        s1.add("satya");

        System.out.println(m2);
    }
}
