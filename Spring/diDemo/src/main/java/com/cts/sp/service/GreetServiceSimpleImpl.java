package com.cts.sp.service;

public class GreetServiceSimpleImpl implements IGreetService {

	public String greet(String userName) {
		return "Hello "+userName;
	}

}
