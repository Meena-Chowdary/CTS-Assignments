package com.cts.hp.model;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Table(name="AllInOneEmps")
//@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("emp")

//@Inheritance(strategy=InheritanceType.JOINED)
//@Table(name="BaseEmps")

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="OnlyEmps")
public class Emp {
	@Id
	@Column(name="eid")
	private long eNo;
	
	@Column(name="ename")
	private String eName;
	
	@Column(name="sal")
	private double basic;
	
	
	public Emp() {
	}
	
	public Emp(long eNo, String eName, double basic) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.basic = basic;
	}

	public long geteNo() {
		return eNo;
	}

	public void seteNo(long eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
}
