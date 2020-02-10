package com.cts.hp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="trainees")
public class Trainee_1ToMany implements Comparable<Trainee_1ToMany>{
	@Id
	private int admnNo;
	private String tName;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private Course_1toMany course;

	public Trainee_1ToMany() {
		super();
	}

	public Trainee_1ToMany(int admnNo, String tName, Course_1toMany course) {
		super();
		this.admnNo = admnNo;
		this.tName = tName;
		this.course = course;
	}

	public int getAdmnNo() {
		return admnNo;
	}

	public void setAdmnNo(int admnNo) {
		this.admnNo = admnNo;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public Course_1toMany getCourse() {
		return course;
	}

	public void setCourse(Course_1toMany course) {
		this.course = course;
	}
	
//	public int compareTo(Trainee_1ToMany o) {
//		return (this.admnNo<o.admnNo?-1:(this.admnNo>o.admnNo?1:0));
//	}
//
	public int compareTo(Trainee_1ToMany o) {
		// TODO Auto-generated method stub
		return (this.admnNo<o.admnNo?-1:(this.admnNo>o.admnNo?1:0));
	}

}
