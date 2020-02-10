package com.cts.hp.model;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

//@DiscriminatorValue("manager")
//@Table(name="managers")
@Table(name="mngrs")
public class Manager extends Emp {
	@Column(name="hra")
	private double allowance;

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public Manager() {
		super();
	}

	public Manager(long eNo, String eName, double basic,double allowance) {
		super(eNo, eName, basic);
		this.allowance=allowance;
	}
		
}
