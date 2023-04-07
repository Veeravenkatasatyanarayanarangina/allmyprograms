package com.motivity;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config
{
    @Bean
    public JdbcTemplate getJdbcTemplate()
    {
        DriverManagerDataSource dmds = new DriverManagerDataSource();
        dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dmds.setUrl("jdbc:mysql://localhost:3306/satyaairlines");
        dmds.setUsername("root");
        dmds.setPassword("root");
        return new JdbcTemplate(dmds);
    }
}
