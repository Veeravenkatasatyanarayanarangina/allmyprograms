package com.cunstructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CricketMain
{
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(com.cunstructorinjection.Config.class);

        CricketTeam ct = factory.getBean("crt",CricketTeam.class);
        System.out.println(ct.getInstructions());

    }
}
