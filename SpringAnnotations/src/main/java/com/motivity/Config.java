package com.motivity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.TreeMap;

@Configuration
public class Config {

    TreeMap<String,String> s1 = new TreeMap();

    public Map courses(){

        s1.put("ravindra","geetanjali");
        s1.put("apj abdul kalam","phython");
        s1.put("sql","mysql");
        s1.put("plus","C++");
        return  s1;
    }
    @Bean
    public Student getstudent(){
        return new Student(100,"satya",123,courses());
    }
}