package com.innovatative.model;

public class User {
	private int sid;
	private String name;
	private double fee;
	private String email;

//	alt+shift+s+c to create default constructor
//constructor
	public User() {

	}

//alt+shift+s+r : To Create the Getters And Setters methods
//Getters And Setters methods
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


// alt+shift+s+s : To create the tostring
	// tostring

	@Override
	public String toString() {
		return "User [sid=" + sid + ", name=" + name + ", fee=" + fee + ", email=" + email + ", getSid()=" + getSid()
				+ ", getName()=" + getName() + ", getFee()=" + getFee() + ", getEmail()=" + getEmail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

	
}
