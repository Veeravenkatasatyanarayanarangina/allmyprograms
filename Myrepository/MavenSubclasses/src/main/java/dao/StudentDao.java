package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.student.Stdent;
import util.HibernateUtil;

import java.util.List;

public class StudentDao
{
    public void saveStudent(Stdent student)
    {
        Transaction transaction =null;
        try(Session session = HibernateUtil.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        }
        catch (Exception e)
        {
            if(transaction != null)
            {
                transaction.rollback();
            }
            e.printStackTrace();
        }

    }
    public List<Stdent> getStdents()
    {
        try(Session session = HibernateUtil.getSessionFactory().openSession())
        {
            return session.createQuery("from Stdent",Stdent.class).list();
        }
    }



}
