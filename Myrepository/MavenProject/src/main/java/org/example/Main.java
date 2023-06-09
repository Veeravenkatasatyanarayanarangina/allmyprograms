package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main
{

    public static void main(String[] args)
    {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("configuration.xml").build();

        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Employee satya = new Employee();
        satya.setId(100);
        satya.setLastname("rangina");
        satya.setFirstname("satya");
        satya.setDesignation("ceo");
        session.save(satya);
        t.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();
    }
}