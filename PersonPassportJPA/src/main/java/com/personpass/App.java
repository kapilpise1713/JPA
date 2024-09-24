package com.personpass;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Per_Pass_JPA");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Passport pass1 = new Passport();
        pass1.setP_iden("ALS7657856Ad");
        
        Passport pass2 = new Passport();
        pass2.setP_iden("LPK7686868AS");
        
        DrivingLicence dl1 = new DrivingLicence();
        dl1.setLicenceNumber("SD234112");
        dl1.setState("Maharashtra");
        
        DrivingLicence dl2 = new DrivingLicence();
        dl2.setLicenceNumber("SS234112");
        dl2.setState("Sikkim");
        
        Person per1 = new Person("Kapil Pise","Pandharpur",pass2,dl1);
        Person per2 = new Person("Pratik Jagtap","Pune",pass1,dl2);
        
        em.persist(per1);
        em.persist(per2);
        
        em.getTransaction().commit();
        
        emf.close();
        em.close();
    }
}
