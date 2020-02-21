package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("g2")
public class GreetServiceAdvancedImpl implements IGreetService{
	@Autowired
	@Qualifier("gnp2")//for second implementation, if u want first then use it's id
	private IGreetNoteProvider gnp;
	
	public GreetServiceAdvancedImpl() {
		super();
	}

	public GreetServiceAdvancedImpl(IGreetNoteProvider gnp) {
		super();
		this.gnp = gnp;
	}

	public IGreetNoteProvider getGnp() {
		return gnp;
	}

	public void setGnp(IGreetNoteProvider gnp) {
		this.gnp = gnp;
	}

	public String greet(String userName) {
		return gnp.getGreetNote()+ userName;
	}

	

}
