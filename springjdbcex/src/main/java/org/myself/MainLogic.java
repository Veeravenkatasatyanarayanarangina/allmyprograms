package org.myself;

import com.motivity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainLogic
{
    @Autowired
   private  JdbcTemplate jdbcTemplate;

    public void getdetails()
    {
        List<Map<String,Object>> gt =jdbcTemplate.queryForList("select * from pioletdetails");

        Iterator<Map<String,Object>> i1 = gt.iterator();

        while (i1.hasNext())
        {
            System.out.println(i1.next().toString());
        }

    }
    public int countOf()
    {

        return jdbcTemplate.queryForObject("Select count(*) from pioletdetails", Integer.class);
    }


}
