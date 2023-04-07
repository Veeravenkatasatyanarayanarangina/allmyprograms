package com.cunstructorinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
    @Bean(name = "crt")
    public CricketTeam getobject()
    {
        return new CricketTeam(new CricketCoach());
    }







}
