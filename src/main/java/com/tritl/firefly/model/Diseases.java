package com.tritl.firefly.model;

public class Diseases {
	
	int diseasesId;
	String name;
	
	public Diseases(int diseasesId, String name) {
		this.diseasesId = diseasesId;
		this.name = name;
	}
	
	public int getDiseasesId() {
		return diseasesId;
	}
	public void setDiseasesId(int diseasesId) {
		this.diseasesId = diseasesId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
