package com.studentinfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf =Persistence.createEntityManagerFactory("Stu_Add_JPA");
         EntityManager em= emf.createEntityManager();
         em.getTransaction().begin();
         
         P_Email pe1 = new P_Email("gmail","kapilpise@gmail.com","Active");
         P_Email pe2 = new P_Email("yahoo","gauravdeshmane@yahoo.com","Inactive");
         P_Email pe3 = new P_Email("outlook","rohanpardeshi@outlook.com","Active");
         
         Student s1 = new Student();
         s1.setName("kapil pise");
         s1.setAge(21);
         s1.setCourse("Java FullStack");
         s1.getPadd().add(pe1);
         
         Student s2 = new Student();
         s2.setName("Gaurav Deshmane");
         s2.setAge(21);
         s2.setCourse("Testing");
         s2.getPadd().add(pe2);
         
         Student s3 = new Student();
         s3.setName("Rohan Pardeshi");
         s3.setAge(22);
         s3.setCourse("DevOps");
         s3.getPadd().add(pe3);
         
         em.persist(s1);
         em.persist(s2);
         em.persist(s3);
         
         em.getTransaction().commit();
         
         emf.close();
         em.close();
         
    }
}
