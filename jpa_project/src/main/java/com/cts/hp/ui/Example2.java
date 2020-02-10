package com.cts.hp.ui;

import javax.persistence.EntityManager;

import com.cts.hp.model.ContractEmployee;
import com.cts.hp.model.Emp;
import com.cts.hp.model.Manager;
import com.cts.hp.util.JPAUtil;

public class Example2 {
	public static void main(String[] args) {
		Emp e=new Emp(101,"Meena",25000);
		Manager m =new Manager(102,"Vani",35000,9500);
		ContractEmployee ce=new ContractEmployee(103,"Soumya",45200,11);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		
		System.out.println("All records saved");
		JPAUtil.shutdown();
	}
}
