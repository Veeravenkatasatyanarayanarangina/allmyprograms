package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedLIstEx
{
    public static void main(String[] args)
    {
        List<Integer> l1 = new LinkedList<Integer>();
        l1.add(20); l1.add(34); l1.add(46); l1.add(55); l1.add(55);l1.add((int)'c');
         Integer arr[] = l1.toArray(new Integer[0]);
        l1.sort(Collections.reverseOrder());
        System.out.println(l1);
        System.out.println(arr[1]);
    }
}
