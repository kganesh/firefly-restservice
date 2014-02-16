package com.tritl.firefly.model;

public class HealthCareProvider {
	int insuranceproviderId;
	String name;
	
	public HealthCareProvider(int id , String name) {
		this.insuranceproviderId = id;
		this.name = name;
	}
	
	public int getInsuranceproviderId() {
		return insuranceproviderId;
	}
	public void setInsuranceproviderid(int insuranceproviderId) {
		this.insuranceproviderId = insuranceproviderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
