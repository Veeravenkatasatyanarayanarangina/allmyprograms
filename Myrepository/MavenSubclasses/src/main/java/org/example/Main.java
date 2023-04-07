package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory=meta.getSessionFactoryBuilder().build();
        Session session=factory.openSession();

        Transaction t=session.beginTransaction();
        Payment p1 = new Payment();
        p1.setPid(10);
        p1.setAmount(289.00);
        CreditCard c1 = new CreditCard();
        c1.setPid(123);
        c1.setAmount(450.00);
        c1.setCcType("credit card type");
        Cheque cheque = new Cheque();
        cheque.setPid(312);
        cheque.setAmount(300.99);
        cheque.setCqType("cheque type");
        session.save(p1);
        session.save(c1);
        session.save(cheque);

        t.commit();
        session.close();
        System.out.println("Success");

    }
}