package com.cts.hp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Artists")
public class Artists_ManyToMany implements Comparable<Artists_ManyToMany> {
	@Id
	private int aid;
	private String eName;
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="MovieArtists",
	joinColumns= { @JoinColumn(name="aid")},
	inverseJoinColumns= { @JoinColumn(name="mid")})
	private Set<Movie_ManyToMany> movies;

	public Artists_ManyToMany() {
		super();
	}

	public Artists_ManyToMany(int aid, String eName, Set<Movie_ManyToMany> movies) {
		super();
		this.aid = aid;
		this.eName = eName;
		this.movies = movies;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Set<Movie_ManyToMany> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie_ManyToMany> movies) {
		this.movies = movies;
	}

	public int compareTo(Artists_ManyToMany a) {
		return (this.aid<a.aid?-1:(this.aid>a.aid?1:0));
	}
	
	
}
