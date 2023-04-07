package onetomany.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App
{
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("configuaration.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Laptop l1 = new Laptop();
        l1.setLid(2);
        l1.setLname("hp");
        Student s1 = new Student();
        s1.setSid(1);
        s1.setSname("satya");
        s1.setMarks(100);
        s1.getLaptop().add(l1);
        l1.setStudent(s1);
        session.persist(s1);
        session.persist(l1);
        t.commit();

        session.close();
        System.out.println("success..........................");





    }
}
