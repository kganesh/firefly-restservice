package com.tritl.firefly.rest.mvc.controller;

import com.tritl.firefly.service.FireflyDataServices;

public class BaseController {
	
	private FireflyDataServices fireflyDataService;

	public void setFireflyDataService(FireflyDataServices fireflyDataService) {
		this.fireflyDataService = fireflyDataService;
	}

	public FireflyDataServices getFireflyDataService() {
		return fireflyDataService;
	}	
	

}
