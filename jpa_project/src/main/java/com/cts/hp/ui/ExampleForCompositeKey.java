package com.cts.hp.ui;

import java.sql.Date;

import javax.persistence.EntityManager;

import com.cts.hp.model.Student;
import com.cts.hp.util.JPAUtil;

import StudentDemo.StudentIdentity;

public class ExampleForCompositeKey {

	public static void main(String[] args) {
		Student s=new Student(new StudentIdentity(1,'C',7),"Meena","Chowdary",new Date(2000,5,5));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		
		System.out.println("Student saved");
		JPAUtil.shutdown();
	}

}
