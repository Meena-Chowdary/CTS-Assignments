package com.cts.hp.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;

import com.cts.hp.model.Artists_ManyToMany;
import com.cts.hp.model.Movie_ManyToMany;
import com.cts.hp.util.JPAUtil;

public class ManyToMany {

	public static void main(String[] args) {
		Artists_ManyToMany a1= new Artists_ManyToMany(101,"Prabhas",new TreeSet<Movie_ManyToMany>());
		Artists_ManyToMany a2= new Artists_ManyToMany(102,"Anushka",new TreeSet<Movie_ManyToMany>());
		Artists_ManyToMany a3= new Artists_ManyToMany(103,"Allu Arjun",new TreeSet<Movie_ManyToMany>());
		
		Movie_ManyToMany m1= new Movie_ManyToMany(101,"Bahubali",new TreeSet<Artists_ManyToMany>());
		Movie_ManyToMany m2= new Movie_ManyToMany(102,"Rudramadevi",new TreeSet<Artists_ManyToMany>());
		
		m1.getArtists().add(a1);
		m1.getArtists().add(a2);
		
		m2.getArtists().add(a2);
		m2.getArtists().add(a3);

		a1.getMovies().add(m1);
		a2.getMovies().add(m1);
		a2.getMovies().add(m2);
		a3.getMovies().add(m2);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.getTransaction().commit();
		
		System.out.println("All records saved");
		JPAUtil.shutdown();
	}

}
