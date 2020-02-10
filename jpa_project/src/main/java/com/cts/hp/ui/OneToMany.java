package com.cts.hp.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;

import com.cts.hp.model.Course_1toMany;
import com.cts.hp.model.Trainee_1ToMany;
import com.cts.hp.util.JPAUtil;

public class OneToMany {

	public static void main(String[] args) {
		Course_1toMany mca=new Course_1toMany(101,"btech",new TreeSet<Trainee_1ToMany>());
		Course_1toMany mba=new Course_1toMany(102,"mba",new TreeSet<Trainee_1ToMany>());
		
		mca.getTrainees().add(new Trainee_1ToMany(201,"Meena",mca));
		mca.getTrainees().add(new Trainee_1ToMany(202,"Soumya",mca));
		mca.getTrainees().add(new Trainee_1ToMany(203,"Vani",mca));
		
		mba.getTrainees().add(new Trainee_1ToMany(204,"Meena",mba));
		mba.getTrainees().add(new Trainee_1ToMany(205,"Meena",mba));
		mba.getTrainees().add(new Trainee_1ToMany(206,"Meena",mba));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(mca);
		em.persist(mba);
		em.getTransaction().commit();
		
		System.out.println("All records saved");
		JPAUtil.shutdown();
	}

}
