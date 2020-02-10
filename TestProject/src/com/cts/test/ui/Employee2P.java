package com.cts.test.ui;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cts.test.model.Employee2;



public class Employee2P {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream oout=null;
		try {
			FileOutputStream out=new FileOutputStream("output.txt");
			oout=new ObjectOutputStream(out);
			
			Set<Employee2> pq = new TreeSet<Employee2>();
			Employee2 e1 = new Employee2(1,"Palak",LocalDate.of(1820,1, 27));
			pq.add(e1); 
			Employee2 e2 = new Employee2(2,"Anmol",LocalDate.of(1945, 10, 7)); 
			pq.add(e2);          
			Employee2 e3 = new Employee2(3,"Nandini",LocalDate.of(2000, 05, 26)); 
			pq.add(e3); 
			System.out.println("Employees Sorted by age ");
			oout.writeObject(e1);
			oout.writeObject(e2);
			oout.writeObject(e3);
			FileOutputStream fileOut = new FileOutputStream("input.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			for(Employee2 emp: pq) {
				objOut.writeObject(emp);
				
			}
			oout.close();
			File my =new File("input.txt");
			BufferedReader br = new BufferedReader(new FileReader(my)); 
			String st; 
			while ((st = br.readLine()) != null) {
			    System.out.println(st); 
			} 
		}catch(DateTimeException exep) {
			exep.printStackTrace();
		}
		
}
}