package com.personpass;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_info")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Address")
	private String address;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "pass_id", unique = true)
	private Passport passport;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "dlic_id", unique = true) // Fix missing JoinColumn for DrivingLicence
	private DrivingLicence d_licence;
	
	
	public Person() {
		super();
	}

	public Person(String name, String address, Passport passport, DrivingLicence d_licence) {
		super();
		this.name = name;
		this.address = address;
		this.passport = passport;
		this.d_licence = d_licence;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public DrivingLicence getD_licence() {
		return d_licence;
	}

	public void setD_licence(DrivingLicence d_licence) {
		this.d_licence = d_licence;
	}
	
	
	
	
	

}
