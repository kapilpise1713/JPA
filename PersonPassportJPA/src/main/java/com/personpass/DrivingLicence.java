package com.personpass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "drive_info")
public class DrivingLicence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_id;
	@Column(name = "L_Number")
	private String licenceNumber;
	@Column(name = "State")
	private String state;
	@OneToOne(mappedBy="d_licence")
	
	private Person person;

	public DrivingLicence() {
		super();
	}

	public DrivingLicence(String licenceNumber, String state, Person person) {
		super();
		this.licenceNumber = licenceNumber;
		this.state = state;
		this.person = person;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	

}
