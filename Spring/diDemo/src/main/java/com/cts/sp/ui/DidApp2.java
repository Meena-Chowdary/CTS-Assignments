package com.cts.sp.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.sp.service.GreetServiceAdvancedImpl;
import com.cts.sp.service.GreetServiceEnhancedImpl;
import com.cts.sp.service.IGreetService;

public class DidApp2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		
		GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs2.greet("Meena"));
		gs2.setGreeting("Vanakam");
		System.out.println(gs2.greet("Meena"));
		
		GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs3.greet("Meena"));
		
		IGreetService gs4=(IGreetService) context.getBean("g3");
		System.out.println(gs4.greet("meena"));
		
		
	}

}
