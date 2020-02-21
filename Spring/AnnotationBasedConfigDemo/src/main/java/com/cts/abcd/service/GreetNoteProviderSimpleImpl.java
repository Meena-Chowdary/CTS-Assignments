package com.cts.abcd.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("gnp1")
//@Primary
public class GreetNoteProviderSimpleImpl implements IGreetNoteProvider {
	
	
	public String getGreetNote() {
		return "Hello";
	}

}
