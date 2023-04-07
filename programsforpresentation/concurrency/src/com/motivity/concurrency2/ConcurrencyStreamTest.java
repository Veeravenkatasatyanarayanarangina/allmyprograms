package com.motivity.concurrency2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ConcurrencyStreamTest
{
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(111,"satya","cs",999));
        list.add(new Student(222,"ram","dev",996));
        list.add(new Student(333,"laxman","ethics",896));
        list.add(new Student(444,"hanuman","rules",999));

        list.forEach(System.out::println);
        long starttime = System.currentTimeMillis();
        List sorteditems = list.stream().sorted(Comparator.comparing(Student::getMarks)).collect(Collectors.toList());
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime);
        starttime = System.currentTimeMillis();
        List sorted2 = list.parallelStream().sorted(Comparator.comparing(Student::getMarks)).collect(Collectors.toList());
        endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime);


    }
}
