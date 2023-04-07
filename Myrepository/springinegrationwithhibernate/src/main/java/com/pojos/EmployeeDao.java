package com.pojos;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;


import java.util.List;

public class EmployeeDao {
    @Autowired
    JdbcTemplate template;
     private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveEmployee(Employee e){

        Session se = sessionFactory.openSession();
        Transaction tx = se.beginTransaction();
        se.save(e);
        tx.commit();
        se.close();

    }
    //method to update employee
   //public void updateEmployee(Employee e){
     //   template.update(e);
   //}
  // method to delete employee
  //public void deleteEmployee(Employee e){
//        template.delete(e);
//    }
//    //method to return one employee of given id
//    public Employee getById(int id){
//        Employee e=(Employee)template.get(Employee.class,id);
//        return e;
//    }

    public List<Employee> getDetails()
    {
        Session se = sessionFactory.openSession();
        Transaction tx = se.beginTransaction();
        List<Employee> employees = se.createQuery("from Employee e").list();
        tx.commit();
        return employees;

    }

}
