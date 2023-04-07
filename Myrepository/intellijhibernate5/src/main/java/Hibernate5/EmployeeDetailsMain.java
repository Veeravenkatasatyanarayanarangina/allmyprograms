package Hibernate5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class EmployeeDetailsMain
{
    public static void main(String[] args)
    {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernateconfiguration.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory=meta.getSessionFactoryBuilder().build();
        Session session=factory.openSession();

        Transaction t=session.beginTransaction();
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.setId(107);
        emp1.setName("Rao");
        emp1.setEmail("rao@gmail.com");
        emp1.setLoc("pune");
        emp1.setExp(30);
        emp1.setDesignation("chairman");
        Eaddress ed = new Eaddress();
        ed.setAddressId(1);
        ed.setAddressLine1("vedanthapuram");
        ed.setCity("jangareddygudem");
        ed.setState("andhrapradesh");
        ed.setCountry("india");
        ed.setPincode(534312);
        emp1.setAddress(ed);
        ed.setEmployeeDetails(emp1);

        session.persist(emp1);


        t.commit();
        session.close();
        System.out.println("success");
    }
}