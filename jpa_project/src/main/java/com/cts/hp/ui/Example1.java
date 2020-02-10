package com.cts.hp.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cts.hp.model.Employee;
import com.cts.hp.util.JPAUtil;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Create an emp obj
		Employee e=new Employee();
		System.out.println("Empid:");
		e.setEmpId(sc.nextInt());
		System.out.println("Ename: ");
		e.setEmpName(sc.next());
		System.out.println("Basic: ");
		e.setBasic(sc.nextDouble());
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Emp saved ");
		JPAUtil.shutdown();

		}
}
