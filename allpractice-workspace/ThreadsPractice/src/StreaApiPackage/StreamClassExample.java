/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StreaApiPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Satyanarayana
 */
public class StreamClassExample {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(2);
        List a = li.stream().distinct().collect(Collectors.toList());
        System.out.println(a);
        
        
    }   
    
}
