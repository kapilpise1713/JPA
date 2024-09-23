package com.colddrink;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="colddata")
public class SoftDrink {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Owner")
	private String owner;
	@Column(name="Tagline")
	private String tagline;
	@Column(name="Rokra")
	private int price;
	
	
	public SoftDrink() {
		super();
	}


	public SoftDrink(String name, String owner, String tagline, int price) {
		super();
		this.name = name;
		this.owner = owner;
		this.tagline = tagline;
		this.price = price;
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


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getTagline() {
		return tagline;
	}


	public void setTagline(String tagline) {
		this.tagline = tagline;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
