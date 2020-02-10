package com.cts.hp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course_1toMany {
	@Id
	private int cId;
	private String cName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="course")
	private Set<Trainee_1ToMany> trainees;
	
	public Course_1toMany() {
		super();
	}

	public Course_1toMany(int cId, String cName, Set<Trainee_1ToMany> trainees) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.trainees = trainees;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Set<Trainee_1ToMany> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee_1ToMany> trainees) {
		this.trainees = trainees;
	}
	
}
