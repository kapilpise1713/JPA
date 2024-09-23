package com.studentinfo;

import jakarta.persistence.Embeddable;

@Embeddable
public class P_Email {
	
	private String provider;
	private String p_Email;
	private String status;
	
	public P_Email() {
		super();
	}

	public P_Email(String provider, String p_Email, String status) {
		super();
		this.provider = provider;
		this.p_Email = p_Email;
		this.status = status;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getP_Email() {
		return p_Email;
	}

	public void setP_Email(String p_Email) {
		this.p_Email = p_Email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
