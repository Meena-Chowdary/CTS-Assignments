package com.cts.hp.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address_Composite implements Serializable{
	private String dno;
	private String addressLine1;
	private String addressLine2;
	
	
	public Address_Composite() {
		super();
	}
	public Address_Composite(String dno, String addressLine1, String addressLine2) {
		super();
		this.dno = dno;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}
	
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	
}
