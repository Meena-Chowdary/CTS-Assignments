package com.cts.test.ui;

import com.cts.test.model.GenericClass;

public class GenericClient {

	public static void main(String[] args) {
		GenericClass<Integer> m=new GenericClass<>();
		m.add(2);
		System.out.println(m.get());
		GenericClass<String> m2=new GenericClass<>();
		m2.add("meena");
		System.out.println(m2.get());
	}

}
