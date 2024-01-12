package com.xworkz.jpa.boot;

import com.xworkz.jpa.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JPARunner {

    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em = emf.createEntityManager();
        System.out.println("EM:"+em);
       EntityTransaction et = em.getTransaction();

        et.begin();

        List<FilmEntity> movie =new  ArrayList<FilmEntity>(Arrays.asList(new FilmEntity(1,"LEO","Vijay","LokeshKanagaraj","Anirudh"),new FilmEntity(2,"Ayaalan","SK","Ravikumar","AR rahman"),new FilmEntity(3,"CaptainMiller","Dhanush","vetrimaran","GVP"),new FilmEntity(4,"Rajakumara","PuneethRajkumar","Anandram","Harikrishna"),new FilmEntity(5,"VikrantRona","Sudeepa","Anil","Arjunjanya")));
        for (FilmEntity flm:movie){
            em.persist(flm);
        }

        List<ShopEntity> shop =new  ArrayList<ShopEntity>(Arrays.asList(new ShopEntity(1,"SKDM","Kumaran K","Bhadravathi")
                ,new ShopEntity(2,"RJ Silks","Jeevan K","Bhadravathi")
                ,new ShopEntity(3,"KSRJ Silks","Rupesh K","Shivamogga"),
                new ShopEntity(4,"Surya Silks","Suryakala","Bengaluru")
                ,new ShopEntity(5,"Jeevan fabrics","Jeevan K","coimbatore")));
        for (ShopEntity shp:shop){
            em.persist(shp);
    }
        List<FestivalEntity> festival = new ArrayList<FestivalEntity>(Arrays.asList(new FestivalEntity(1,"Sankranti","January","winter"),new FestivalEntity(2,"Ganapathi","Sepetmber","Rainy"),new FestivalEntity(3,"Deepavali","November","monsoon")));
        for(FestivalEntity fest:festival){
            em.persist(fest);
        }



        List<SportsEntity> sport = new ArrayList<SportsEntity>(Arrays.asList(new SportsEntity(1,"Cricket",11,"chinnaswamy"),new SportsEntity(2,"Volleyball",7,"Visl"),new SportsEntity(3,"Kabbadi",8,"Savai man singh")));
        for (SportsEntity sprt:sport){
            em.persist(sprt);
        }

        List<ActorEntity> actor = new ArrayList<ActorEntity>(Arrays.asList(new ActorEntity(1,"Vijay","Tamil"),new ActorEntity(2,"Puneeth","Kannada"),new ActorEntity(3,"SRK","HIndi")));
        for (ActorEntity actr:actor){
            em.persist(actr);
        }






        et.commit();
        em.close();
        emf.close();




    }
}
