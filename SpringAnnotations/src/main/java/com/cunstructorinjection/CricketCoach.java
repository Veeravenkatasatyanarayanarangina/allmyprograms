package com.cunstructorinjection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach
{
    public CricketCoach() {
        System.out.println("cricket coach class constructor");
    }
    public String getDailyWorkout()
    {
       return "5hrs practice";
    }

}
