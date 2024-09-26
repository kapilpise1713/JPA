package com.actormovie;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "actor_data")
public class Actors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Name", nullable = false)
	private String name;
	@Column(name = "Age", nullable = false)
	private int age;
	
	@ManyToMany(mappedBy = "actors")
	private Set<Movies> movies = new HashSet<Movies>();

	public Actors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actors(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Movies> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movies> movies) {
		this.movies = movies;
	}
	
	
	

}
