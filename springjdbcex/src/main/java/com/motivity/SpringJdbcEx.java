package com.motivity;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SpringJdbcEx
{
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }
    public void selectEx()
    {
        List<Map<String, Object>> li = jdbcTemplate.queryForList("select * from  pioletdetails ");
        Iterator i = li.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next().toString());
        }
    }
    public void insertme()
    {
        jdbcTemplate.execute("insert into pioletdetails values ('satya','satya3@gmail.com','34',190,347)");
        System.out.println("successfully inserted");
    }
    public void updateme()
    {
        jdbcTemplate.update("update pioletdetails set pname = ? where pid = ? ","veera",100);
        System.out.println("successfullyu updated.................");
        List<Map<String, Object>> li = jdbcTemplate.queryForList("select * from  pioletdetails where pid =100");
        Iterator i = li.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next().toString());
        }
    }
    public int countOf()
    {
        return jdbcTemplate.queryForObject("Select count(*) from pioletdetails", Integer.class);
    }




}
