package Hibernate5;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class RetraiveEmpDetails
{
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernateconfiguration.xml");
        SessionFactory sf  = cfg.buildSessionFactory();

        Session se = sf.openSession();
        Transaction tr = se.beginTransaction();
      // Query qr = se.createQuery("from EmployeeDetails e1 where e1.id in (:x,:y)");
     //  qr.setParameter("x",102);
     //  qr.setParameter("y",105);

        NativeQuery nq = se.createSQLQuery("update EmployeeDetails ed set ed.designation = 'Assosciate' where ed.eid =102");
                       int a = nq.executeUpdate();
    //  Criterion cr = Restrictions.ilike("loc","%rr%");
      //  criteria.add(cr);
       List li = nq.list();
        Iterator it  = li.iterator();

        while(it.hasNext()) {
          Object[] o = (Object[]) it.next();
           System.out.println(o[0]+" - "+o[1]+"- "+o[2]+"- "+o[3]+"- ");
           // EmployeeDetails ed = (EmployeeDetails) it.next();
           // System.out.println(ed.getId()+" "+ed.getName()+" "+ed.getEmail()+" "+ed.getDesignation()+" "+ed.getSalary());
        }
        tr.commit();
        System.out.println("updated");

        se.close();

    }
}
