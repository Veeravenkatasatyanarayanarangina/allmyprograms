package assignment3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment8
{
    public static void main(String[] args)
    {
        HashMap<Integer ,String> hm = new HashMap<Integer, String>();
        hm.put(2,"satya");
        hm.put(3,"shiva");
        hm.put(4,"vinayak");
        hm.put(5,"venky");
        System.out.println("hash map is : "+hm);
        System.out.println(" key 2 is present : "+hm.containsKey(2));
        System.out.println(" key 3 is present : "+hm.containsKey(3));
        System.out.println("value satya is present or not : "+hm.containsValue("satya"));
        System.out.println("value ss is present or not : "+hm.containsValue("ss"));
        Iterator<Map.Entry<Integer, String>> k = hm.entrySet().iterator();
        while (k.hasNext())
        {
            System.out.println(k.next());
        }


    }
}
