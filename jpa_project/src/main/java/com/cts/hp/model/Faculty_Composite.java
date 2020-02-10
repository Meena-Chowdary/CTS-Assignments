package com.cts.hp.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculties")
public class Faculty_Composite {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long facId;
	private String facName;
	
	@Embedded
	private Address_Composite address;
	
	
	public Faculty_Composite() {
		super();
	}


	public Faculty_Composite(String facName, Address_Composite address) {
		super();
		this.facName = facName;
		this.address = address;
	}

	public String getFacName() {
		return facName;
	}


	public void setFacName(String facName) {
		this.facName = facName;
	}


	public Address_Composite getAddress() {
		return address;
	}


	public void setAddress(Address_Composite address) {
		this.address = address;
	}
	
	
}
