package com.tritl.firefly.model;

public class Person {
	int personId;
	String email;
	String password;
	String dob;
	int zipcode;
	String personName;
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Person(int personId, String personName) {
		this.personId = personId;
		this.personName = personName;
	}
	
 	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personid) {
		this.personId = personid;
	}
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	

}
