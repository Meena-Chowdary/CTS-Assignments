package com.cts.hp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="customers")
public class Customer_1to1 {
	@Id
	@Column(name="aadhar")
	private String aadhar;
	private String name;
	
	@OneToOne(mappedBy="customer",cascade=CascadeType.ALL)
	private BankAccount_1to1 account;

	public Customer_1to1() {
		super();
	}

	public Customer_1to1(String aadhar, String name, BankAccount_1to1 account) {
		super();
		this.aadhar = aadhar;
		this.name = name;
		this.account = account;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount_1to1 getAccount() {
		return account;
	}

	public void setAccount(BankAccount_1to1 account) {
		this.account = account;
	}
	
}
