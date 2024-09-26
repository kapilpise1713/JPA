package com.actormovie;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "movie_data")
public class Movies {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@Column(name = "Name", nullable = false)
	private String name;
	@Column(name = "IMDB_Rating", nullable = false)
	private double imdb;
	@Column(name = "Year_Of_Release", nullable = false)
	private int y_o_r;
	
	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(
			name = "movie_actor",
			joinColumns = {@JoinColumn(name="movie_id")},
			inverseJoinColumns = {@JoinColumn(name="actor_id")}
			)
	
	private Set<Actors> actors = new HashSet<Actors>();

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movies(String name, double imdb, int y_o_r) {
		super();
		this.name = name;
		this.imdb = imdb;
		this.y_o_r = y_o_r;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}

	public int getY_o_r() {
		return y_o_r;
	}

	public void setY_o_r(int y_o_r) {
		this.y_o_r = y_o_r;
	}

	public Set<Actors> getActors() {
		return actors;
	}

	public void setActors(Set<Actors> actors) {
		this.actors = actors;
	}
	
	
	
	
	
	
	

}
