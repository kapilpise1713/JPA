package com.empaddexam;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
      // EntityManangerFactory emf =Persistence.createEntityManagerFactory("Emp_Add_JPA");
       EntityManagerFactory emf =Persistence.createEntityManagerFactory("Emp_Add_JPA");
       EntityManager em= emf.createEntityManager();
       em.getTransaction().begin();
       
       P_Address pa1= new P_Address(737101,"Gangtok","Sikkim");
       P_Address pa2= new P_Address(413213,"Mohol","Maharashtra");
       
       Employee emp1 =new Employee();
       emp1.setName("Siddharth  Sirehia");
       emp1.setDept("Traning");
       emp1.setCaddress("pune");
       emp1.setSalary(1000);
       emp1.getPadd().add(pa1);
       
       Employee emp2 =new Employee();
       emp2.setName("Gaurav  Deshmane");
       emp2.setDept("Developer");
       emp2.setCaddress("pune");
       emp2.setSalary(900);
       emp2.getPadd().add(pa2);
       
       
       em.persist(emp1);
       em.persist(emp2);
       
       em.getTransaction().commit();
       
      emf.close();
      em.close();
       
       
       
       
       
    }
}