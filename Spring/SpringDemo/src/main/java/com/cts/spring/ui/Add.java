package com.cts.spring.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.spring.service.IAddService;

public class Add {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		IAddService a=(IAddService) context.getBean("g2");
		System.out.println(a.add(1,2));

	}

}
