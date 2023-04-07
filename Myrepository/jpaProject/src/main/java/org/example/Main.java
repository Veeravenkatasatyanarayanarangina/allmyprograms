package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
   static EntityManager entityManager;

    public static void main(String[] args) {
        entityManager = org.util.Persistence.getEntityManager();
        entityManager.getTransaction().begin();

        Student s1 = new Student();
        s1.setId(108);
        s1.setName("thor");
        s1.setMarks("450");
        s1.setBranch("hai");
        entityManager.persist(s1);
        entityManager.getTransaction().commit();
        entityManager.close();


        System.out.println("insertion success.......");
    }
}