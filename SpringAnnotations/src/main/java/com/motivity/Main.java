package com.motivity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;
import java.util.Map;

public class Main
{
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);

        Student s =factory.getBean(Student.class);
        System.out.println("studntName = "+s.getName()+", smarks = "+s.getMarks()+", sid = "+s.getId()+", smarks = "+s.getMarks()+"");
        System.out.println(s.getCourses().entrySet());
        Iterator<Map> i = s.getCourses().entrySet().iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }


    }
}
