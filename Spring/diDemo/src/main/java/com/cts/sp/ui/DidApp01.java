package com.cts.sp.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cts.sp.service.IGreetService;

public class DidApp01 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		IGreetService gs=(IGreetService) context.getBean("g1");
		System.out.println(gs.greet("Meena"));
		IGreetService gs2=(IGreetService) context.getBean("g3");
		System.out.println(gs2.greet("Meena"));
		IGreetService gs3=(IGreetService) context.getBean("g5");
		System.out.println(gs3.greet(" Meena"));
		
		
	}

}
