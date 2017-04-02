package com.company_login;

public class GetsSets{
	
	public String email;
	public String password;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "GetsSets [email=" + email + ", password=" + password + "]";
	}
}
