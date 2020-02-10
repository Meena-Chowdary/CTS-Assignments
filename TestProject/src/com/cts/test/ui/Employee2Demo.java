package com.cts.test.ui;

import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;

import java.io.PrintStream;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cts.test.model.Employee2;

public class Employee2Demo {

	public static void main(String[] args) throws IOException {
		FileOutputStream  fos=null;
		int id=0;
		String name;
		LocalDate date;
		DateTimeFormatter dtFormater;
		while(id!=0) {
		try {
			Set<Employee2> pq = new TreeSet<Employee2>();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter empId");
			id=sc.nextInt();
			System.out.println("Enter empName");
			name=sc.nextLine();
			System.out.println("Enter dob");
			dtFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		}catch(Exception exep) {
			exep.printStackTrace();
		}
		}
	}
}
		//pq.add
			
			
					
					
					
					
					
					
					
//			File file = new File("out.txt");
//			fos = new FileOutputStream(file);
//			PrintStream ps = new PrintStream(fos);
//			System.setOut(ps);
//			System.out.println("This goes to out.txt");
//
//			
//			Set<Employee2> pq = new TreeSet<Employee2>();
//			Employee2 e1 = new Employee2(101,"Nandini",LocalDate.of(1994,1, 27));
//			pq.add(e1); 
//			Employee2 e2 = new Employee2(102,"Anmol",LocalDate.of(1969, 10, 7)); 
//			pq.add(e2);          
//			Employee2 e3 = new Employee2(103,"Palak",LocalDate.of(1999, 05, 26)); 
//			pq.add(e3); 
//			System.out.println("Employees served in their age order");
//			for(Employee2 emp: pq) {
//				System.out.println(emp.getEmpName());	
//			}
//		}catch(DateTimeException exep) {
//			exep.printStackTrace();
//		}finally {
//			try {
//				fos.close();
//			}catch(Exception exep) {
//				exep.printStackTrace();
//			}
//		}
//		

