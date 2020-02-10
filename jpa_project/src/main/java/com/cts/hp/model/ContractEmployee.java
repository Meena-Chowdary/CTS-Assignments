package com.cts.hp.model;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

//@DiscriminatorValue("cemp")
//@Table(name="cepms")
@Table(name="contract")

public class ContractEmployee extends Emp{
	@Column(name="cdur")
	private int duration;

	public ContractEmployee(long eNo, String eName, double basic,int duration) {
		super(eNo, eName, basic);
		this.duration=duration;
	}

	public ContractEmployee() {
		super();
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
