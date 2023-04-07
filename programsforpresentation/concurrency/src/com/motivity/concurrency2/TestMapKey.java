package com.motivity.concurrency2;
import java.util.Map;
import java.util.TreeMap;

public class TestMapKey
{
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("satya",1);
        map.put("Satya",2);
        System.out.println(map);
        map.put("satya",10);
        System.out.println(map);
        map.put("SAtya",60);
        System.out.println(map);
    }
}
