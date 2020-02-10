package com.cts.hp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Movies")
public class Movie_ManyToMany implements Comparable<Movie_ManyToMany>{
	@Id
	private int mId;
	private String mName;
	
	@ManyToMany(mappedBy="movies")
	private Set<Artists_ManyToMany> artists;

	public Movie_ManyToMany() {
		super();
	}

	public Movie_ManyToMany(int mId, String mName, Set<Artists_ManyToMany> artists) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.artists = artists;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Set<Artists_ManyToMany> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artists_ManyToMany> artists) {
		this.artists = artists;
	}

	public int compareTo(Movie_ManyToMany m) {
		return (this.mId<m.mId?-1:(this.mId>m.mId?1:0));
	}

	
	
}
