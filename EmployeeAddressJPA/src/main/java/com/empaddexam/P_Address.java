package com.empaddexam;

import jakarta.persistence.Embeddable;

@Embeddable 
public class P_Address {
	
	private int p_pin;
	private String p_city;
	private String p_state;
	
	
	
	public P_Address() {
		super();
	}



	public P_Address(int p_pin, String p_city, String p_state) {
		super();
		this.p_pin = p_pin;
		this.p_city = p_city;
		this.p_state = p_state;
	}



	public int getP_pin() {
		return p_pin;
	}



	public void setP_pin(int p_pin) {
		this.p_pin = p_pin;
	}



	public String getP_city() {
		return p_city;
	}



	public void setP_city(String p_city) {
		this.p_city = p_city;
	}



	public String getP_state() {
		return p_state;
	}



	public void setP_state(String p_state) {
		this.p_state =p_state;
	}
	
}