package manytomany.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;

public class StoreDataManytoMany
{
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("configuaration.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session= factory.openSession();
        Transaction t = session.beginTransaction();

        Answers an1 = new Answers();
        an1.setAnswername("Java is a programming language");
        an1.setPostedBy("satya");
        Answers an2 = new Answers();
        an1.setAnswername("java is a platform");
        an2.setPostedBy("veera");
        Qustions q1 =new Qustions();
        q1.setQname("what is java");
        ArrayList<Answers> l1 = new ArrayList<Answers>();
        l1.add(an1);
        l1.add(an2);
        q1.setAnswers(l1);

        Answers ans3=new Answers();
        ans3.setAnswername("Servlet is an Interface");
        ans3.setPostedBy("Jai Kumar");

        Answers ans4=new Answers();
        ans4.setAnswername("Servlet is an API");
        ans4.setPostedBy("Arun");

        Qustions q2=new Qustions();
        q2.setQname("What is Servlet?");
        ArrayList<Answers> l2=new ArrayList<Answers>();
        l2.add(ans3);
        l2.add(ans4);
        q2.setAnswers(l2);

        session.persist(q1);
        session.persist(q2);
        t.commit();
        session.close();
        System.out.println("successes...............");


    }
}
