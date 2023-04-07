package com.mobilestore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class retriverecords
{

    public static void main(String[] args) {
        Configuration configuration= new Configuration().configure("config.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session se = factory.openSession();
        MobileStore ms1 = (MobileStore) se.load(MobileStore.class,103);
        System.out.println(ms1.getMid()+" "+ms1.getPrice()+" "+ms1.getMname()+" "+ms1.getRam()+" "+ms1.getOs());
        MobileStore ms = (MobileStore) se.load(MobileStore.class,101);
        System.out.println(ms.getMid()+" "+ms.getPrice()+" "+ms.getMname()+" "+ms.getRam()+" "+ms.getOs());
        Query query = se.getNamedQuery("callMobileStoreStoreProcedure").setParameter("mid",101);
        List res = query.getResultList();
        for(int i =0;i<res.size();i++)
        {
            MobileStore mb = (MobileStore) res.get(i);
            System.out.println(mb.getMid()+"  "+mb.getMname()+" "+mb.getPrice()+" "+mb.getRam());

        }
        System.out.println(se.getStatistics());
        se.close();
        System.out.println("==============================================");
        Session se2 = factory.openSession();
       ms1 = (MobileStore) se2.load(MobileStore.class,103);
        System.out.println(ms1.getMid()+" "+ms1.getPrice()+" "+ms1.getMname()+" "+ms1.getRam()+" "+ms1.getOs());
        se2.close();
    }
}
