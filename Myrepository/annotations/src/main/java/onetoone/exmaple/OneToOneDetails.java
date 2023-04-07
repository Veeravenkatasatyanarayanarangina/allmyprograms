package onetoone.exmaple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class OneToOneDetails
{
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("configuaration.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();
        EmployeeOneToOne e1= new EmployeeOneToOne();
        e1.setEname("satya");
        e1.setEmail("satya@gmail.com");

        Address1_1 address11 = new Address1_1();
        address11.setAddressLine1("vedanthapuram");
        address11.setCit("Eluru");
        address11.setState("ap");
        address11.setCountry("india");
        address11.setPincode(534312);
        e1.setAddress(address11);
        address11.setEmployeeOneToOne(e1);
        session.persist(e1);
        t.commit();

        session.close();
        System.out.println("success..........................");
    }


}
