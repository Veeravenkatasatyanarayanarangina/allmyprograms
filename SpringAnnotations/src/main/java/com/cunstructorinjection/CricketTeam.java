package com.cunstructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketTeam
{
    private CricketCoach coach;
    @Autowired
    public CricketTeam(CricketCoach coach)
    {
        this.coach = coach;

    }
    public String getInstructions()
    {
        return "Coach Instruction: "+this.coach.getDailyWorkout();
    }



}
