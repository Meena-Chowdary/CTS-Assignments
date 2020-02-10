package com.cts.hp.ui;

import javax.persistence.EntityManager;

import com.cts.hp.model.Address_Composite;
import com.cts.hp.model.Faculty_Composite;
import com.cts.hp.util.JPAUtil;

public class CompositeRelation {
	public static void main(String[] args) {
		Faculty_Composite f=new Faculty_Composite("Meena",new Address_Composite("A012","Whitefield Apartments","Bengaluru,Karnataka"));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();		
		em.persist(f);
		em.getTransaction().commit(); //em.flush()to commit all transactions at a time but not working as db is not allowing
		System.out.println("Faculty saved");
		JPAUtil.shutdown();
	}
	
}
