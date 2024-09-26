package com.electricitybills;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("Elect_Bills_JPA");
         EntityManager em = emf.createEntityManager();
         em.getTransaction().begin();
         
         Elect_Company e1 = new Elect_Company();
         e1.setName("Mahavitran");
         e1.setLocation("Mumbai");
         e1.setOwner("Government Of Maharashtra");
         
         Bills b1 = new Bills("Gaurav Deshmane","Mohol","1000",e1);
         Bills b2 = new Bills("Sakshi","Pune","100",e1);
         Bills b3 = new Bills("Rohan","Satara","500",e1);
         
         em.persist(b1);
         em.persist(b2);
         em.persist(b3);
         
         em.getTransaction().commit();
         
         emf.close();
         em.close();
    }
}
