package com.colddrink;

import java.beans.PersistenceDelegate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cold_jpa_drink");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        SoftDrink sf1 = new SoftDrink("REDBULL","Hilton","It Give You Wings",100);
        SoftDrink sf2 = new SoftDrink("Sprite","Coca Cola","Obey Your Thirst",45);
        SoftDrink sf3 = new SoftDrink("Slice","Cola","Hrr Season Aam",80);

       
        em.persist(sf1);
        em.persist(sf2);
        em.persist(sf3);
        
        
        //for update
        
//        SoftDrink sf = em.find(SoftDrink.class, 3);
//        sf.setName("MAZA");
//        sf.setPrice(70);

        
        
//        for add
//        SoftDrink sf4 = new SoftDrink("Mountain Dew","HRX","Dar Kke AGe Jeet He",4);
//        em.persist(sf4);

        
        //for remove 
//        SoftDrink sf = em.find(SoftDrink.class,4 );
//        em.remove(sf);


        em.getTransaction().commit();
        em.close();
        emf.close();

        
        
    }
}
