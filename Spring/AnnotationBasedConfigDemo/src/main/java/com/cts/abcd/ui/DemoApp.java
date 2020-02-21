package com.cts.abcd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.abcd.config.AbcdConfig;
import com.cts.abcd.service.GreetServiceAdvancedImpl;
import com.cts.abcd.service.IGreetService;


public class DemoApp {

	public static void main(String[] args) {
		//Java based Configuration
		ApplicationContext context=new AnnotationConfigApplicationContext(AbcdConfig.class);
		System.out.println(context.getBean("today"));
		//Annotation based Configuration
		IGreetService gs1=(IGreetService) context.getBean("g1");
		System.out.println(gs1.greet("Meena"));
		GreetServiceAdvancedImpl gs2=(GreetServiceAdvancedImpl) context.getBean("g2");
		System.out.println(gs1.greet("Meena"));
	}

}
