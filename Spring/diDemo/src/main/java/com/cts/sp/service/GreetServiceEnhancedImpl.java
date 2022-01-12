package com.cts.sp.service;

public class GreetServiceEnhancedImpl implements IGreetService{
	private String greeting;
	
	public GreetServiceEnhancedImpl() {
		super();
	}

	public GreetServiceEnhancedImpl(String greeting) {
		super();
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String greet(String userName) {
		return greeting+" "+userName;
	}

}