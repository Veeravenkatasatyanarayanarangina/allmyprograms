package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import streamAPI.Employee;

import javax.persistence.Query;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("configuration.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session se = factory.openSession();
        Query query = se.createQuery("from Employee ");
        List<Employee> li = query.getResultList();
        for (Employee em:li) {
            System.out.println(em.getEname()+" "+em.getId()+" "+em.getEmail());
        }
        se.close();
        System.out.println();

        li.stream().filter(s -> s.getEname().startsWith("s")).toList().stream().toList().stream().forEach(d-> System.out.println(d.getEname()));
            se.close();
    }
}
class Sample{
    String name;
    int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Sample() {
    }

    public Sample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}