package com.tritl.firefly.model;

public class Doctor {
	
	int doctorid;
	String name;
	
	public Doctor (int doctorid, String name ) {
		this.doctorid = doctorid ;
		this.name = name;
	}
	
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
