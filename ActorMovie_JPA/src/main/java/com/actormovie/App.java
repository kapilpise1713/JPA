package com.actormovie;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Act_Mov_JPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Actors act1 = new Actors("Rocking Star Yash",38);
        Actors act2 = new Actors("Sai Pallavi", 30);
        Actors act3 = new Actors("Robert Downey Jr.", 59);
        Actors act4 = new Actors("Sidharth Malhotra", 39);
        Actors act5 = new Actors("Sanjay Dutt", 65);
        Actors act6 = new Actors("Jenelia Deshmukh", 38);
        Actors act7 = new Actors("Allu Arjun", 45);
        Actors act8 = new Actors("Jonny Deep", 61);
        Actors act9 = new Actors("Shahrukh Khan", 39);
        Actors act10 = new Actors("Nagarjun", 60);
        Actors act11 = new Actors("Prabhas", 50);
        Actors act12 = new Actors("Ranbir kapoor", 45);
        Actors act13 = new Actors("Amitabh Bachan", 78);
        Actors act14 = new Actors("Akshay Kumar", 38);
        Actors act15 = new Actors("Katrina Kaif", 45);
        
        
        Movies mov1 = new Movies("Tees_Mar_Khan",4.3,2008);
        Movies mov2 = new Movies("Kalki",8.1,2024);
        Movies mov3 = new Movies("Prithviraj Chavan",4.3,2008);
        Movies mov4 = new Movies("KGF 1 & 2",9.2,2022);
        Movies mov5 = new Movies("Brahmastra",7.6,2023);
        Movies mov6 = new Movies("Happy",6.8,2005);
        Movies mov7 = new Movies("Pirates of the Carribean",8.3,2020);
        Movies mov8 = new Movies("Iron Man",9.8,2022);
        Movies mov9 = new Movies("Yodha",7.9,2024);
        Movies mov10 = new Movies("Ramayan",10.0,2025);
        
        
        mov1.getActors().add(act14);
        mov1.getActors().add(act15);
        
        mov2.getActors().add(act11);
        mov2.getActors().add(act13);
        
        mov3.getActors().add(act5);
        mov3.getActors().add(act14);
        
        mov4.getActors().add(act5);
        mov4.getActors().add(act1);
        
        mov5.getActors().add(act13);
        mov5.getActors().add(act12);
        mov5.getActors().add(act10);
        mov5.getActors().add(act9);
        
        mov6.getActors().add(act6);
        mov6.getActors().add(act7);
        
        mov7.getActors().add(act8);
        
        mov8.getActors().add(act3);
        
        mov9.getActors().add(act4);
        
        mov10.getActors().add(act2);
        mov10.getActors().add(act12);
        
        em.persist(mov1);
        em.persist(mov2);
        em.persist(mov3);
        em.persist(mov4);
        em.persist(mov5);
        em.persist(mov6);
        em.persist(mov7);
        em.persist(mov8);
        em.persist(mov9);
        em.persist(mov10);
        
       
        em.getTransaction().commit();
        
        emf.close();
        em.close();
    }
}
