package com.cts.sp.service;

public class GreetServiceAdvancedImpl implements IGreetService{
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
