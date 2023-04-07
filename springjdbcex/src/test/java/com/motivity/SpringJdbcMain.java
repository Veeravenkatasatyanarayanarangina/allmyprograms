package com.motivity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class SpringJdbcMain
{
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        SpringJdbcEx sjex = (SpringJdbcEx) ctx.getBean(SpringJdbcEx.class);
        System.out.println("before update");
        sjex.selectEx();
        System.out.println("after update");
        sjex.updateme();
        System.out.println(sjex.countOf());
        sjex.insertme();

    }
}
