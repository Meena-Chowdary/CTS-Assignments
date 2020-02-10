package com.cts.hp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class BankAccount_1to1 {
	@Id
	private String accno;
	
	@OneToOne
	@JoinColumn(name="aadhar")
	private Customer_1to1 customer;

	
	public BankAccount_1to1() {
		super();
	}

	public BankAccount_1to1(String accno, Customer_1to1 customer) {
		super();
		this.accno = accno;
		this.customer = customer;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public Customer_1to1 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer_1to1 customer) {
		this.customer = customer;
	}
	
}
