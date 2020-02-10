package com.cts.hp.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cts.hp.model.Employee;
import com.cts.hp.util.JPAUtil;

public class JPQLExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		Employee emp=em.find(Employee.class, 101);
		if(emp!=null) {
			System.out.println(emp);
		}
		String qryString="Select e From Employee e";
		Query qry=em.createQuery(qryString);
		
		display(qry.getResultList());
		display(em.createQuery("Select e from Employee e where e.basic>25000").getResultList());
		
		List<String> names=em.createQuery("Select e.empName from Employee e").getResultList();
		
		for(String n : names) {
			System.out.println("The employee name is "+n);
		}
		em.close();
		JPAUtil.shutdown();
	}
	static void display(List<Employee> data) {
		System.out.println("------------------------------------------");
		for(Employee e: data) {
			System.out.println("The employee is"+e);
		}
	}
	
 }
