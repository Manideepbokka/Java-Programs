package com.manideep.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstname;
	private String lastname;
	private String country;
	private LinkedHashMap<String,String> co;
	private String[] os;
	public Student() {
		co=new LinkedHashMap<>();
		co.put("IN", "India");
		co.put("US", "United States Of America");
		co.put("De", "Germany");
		co.put("CN", "Canada");
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LinkedHashMap<String, String> getCo() {
		return co;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}
	
	
	
	
}
