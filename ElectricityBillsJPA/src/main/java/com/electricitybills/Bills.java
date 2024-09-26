package com.electricitybills;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Bills_Data")
public class Bills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Cust_Name")
	private String cust_name;
	@Column(name = "Cust_Address")
	private String cust_add;
	@Column(name = "Amount")
	private String amount;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "company_id")
	
	private Elect_Company elect_Company;

	public Bills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bills(String cust_name, String cust_add, String amount, Elect_Company elect_Company) {
		super();
		this.cust_name = cust_name;
		this.cust_add = cust_add;
		this.amount = amount;
		this.elect_Company = elect_Company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_add() {
		return cust_add;
	}

	public void setCust_add(String cust_add) {
		this.cust_add = cust_add;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Elect_Company getElect_Company() {
		return elect_Company;
	}

	public void setElect_Company(Elect_Company elect_Company) {
		this.elect_Company = elect_Company;
	}
	
	
	

}
