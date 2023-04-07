package com.hibernate.practice.dao;

import com.hibernate.practice.model.TicketDetails;
import com.hibernate.practice.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TicktsDao
{
    public void saveTicketDetails(TicketDetails ticketDetails)
    {
        Transaction transaction = null;
        try
        {
             SessionFactory sf = HibernateUtil.getSessionFactory();
             Session session = sf.openSession();
            transaction = session.beginTransaction();
            session.save(ticketDetails);
            transaction.commit();
            session.close();
        }
        catch (Exception e)
        {
            if(transaction != null ) {
                transaction.rollback();
            }
            else {
                e.printStackTrace();
            }

        }

    }

}
