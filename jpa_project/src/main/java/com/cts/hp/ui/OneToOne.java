package com.cts.hp.ui;

import javax.persistence.EntityManager;

import com.cts.hp.model.BankAccount_1to1;
import com.cts.hp.model.Customer_1to1;
import com.cts.hp.util.JPAUtil;

public class OneToOne {

	public static void main(String[] args) {
		BankAccount_1to1 ba=new BankAccount_1to1();
		Customer_1to1 cs=new Customer_1to1("888555599","Meena",ba);
		ba.setAccno("50001");
		ba.setCustomer(cs);
		
EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cs);
		em.getTransaction().commit();
		
		System.out.println("All records saved");
		JPAUtil.shutdown();
	}

}
