package org.myself;

import com.motivity.SpringJdbcEx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DisplayMain
{
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(ConfigFile.class);
        MainLogic main = app.getBean(MainLogic.class);
        main.getdetails();
        main.countOf();


    }
}
