package com.carjpql;



import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tata_Car");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Tata car1 = new Tata("Nexon","top-model",1700000);
        Tata car2 = new Tata("Safari","second-top-model",2000000);
        Tata car3 = new Tata("Nano","top_model",100000);
        Tata car4 = new Tata("Punch","top_model",1100000);
        Tata car5 = new Tata("Harrier","top_model",2500000);
        
        em.persist(car1);
        em.persist(car2);
        em.persist(car3);
        em.persist(car4);
        em.persist(car5);
        
        em.getTransaction().commit();
        
//        Query query = em.createQuery("select t from Tata t");
        Query query = em.createQuery("select t from Tata t where t.price > 1500000");
        List<Tata> cars = query.getResultList();
        for(Tata c : cars) {
        	System.out.println(c.getCarname());
        }
        
        em.close();
        emf.close();
    }
}
