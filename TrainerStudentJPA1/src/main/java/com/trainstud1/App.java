package com.trainstud1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("Train_Stud_JPA");
       EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
       
       Trainer t1 = new Trainer();
       t1.setName("Sidharth Sirohia");
       t1.setSalary(1000);
       t1.setSubject("Java Full Stack");
       
       Student s1 = new Student("Kapil","CS01","Pandharpur",t1);
       Student s2 = new Student("Gaurav","CS03","Mohol",t1);
       Student s3 = new Student("Rohan","CS04","Pune",t1);
       
       Trainer t2 = new Trainer();
       t2.setName("Nilesh Magar");
       t2.setSalary(100);
       t2.setSubject("Web Development");
       
       Student s4 = new Student("Sachin","CS02","Latur",t2);
       Student s5 = new Student("Kedar","CS05","Mumbai",t2);
       Student s6 = new Student("Shubham","CS06","Pune",t2);
       
       em.persist(s1);
       em.persist(s2);
       em.persist(s3);
       em.persist(s4);
       em.persist(s5);
       em.persist(s6);
       
       em.getTransaction().commit();
       
       emf.close();
       em.close();
    }
}
