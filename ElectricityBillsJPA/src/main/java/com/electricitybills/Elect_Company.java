package com.electricitybills;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Electricity_Comapany")
public class Elect_Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column(name = "C_Name")
	private String name;
	@Column(name = "Location")
	private String location;
	@Column(name = "Owner")
	private String owner;
	
	@OneToMany(mappedBy = "elect_Company", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	Set<Bills> students = new HashSet<Bills>();

	public Elect_Company() {
		super();
	}

	public Elect_Company(String name, String location, String owner, Set<Bills> students) {
		super();
		this.name = name;
		this.location = location;
		this.owner = owner;
		this.students = students;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Set<Bills> getStudents() {
		return students;
	}

	public void setStudents(Set<Bills> students) {
		this.students = students;
	}
	
	

}
