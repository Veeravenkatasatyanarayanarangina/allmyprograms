package org.example;

public class Main {
    public static void main(String[] args) {
        String str = new String("satya");
        String str1 = new String("satya");
        String str2 = new String("yamuna gayatri");
        String temp = str;

        System.out.println(str==str1);
        System.out.println(str == temp);

        System.out.println(str.equals(str1));
        System.out.println(str.equals(temp));


    }
}