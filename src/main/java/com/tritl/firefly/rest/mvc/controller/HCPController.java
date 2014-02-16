package com.tritl.firefly.rest.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tritl.firefly.model.HealthCareProvider;

@Controller
@RequestMapping("/hcproviders")
public class HCPController {

	@RequestMapping(value = "{zip}", method = RequestMethod.GET)
	public @ResponseBody
	
	List<HealthCareProvider> getHCProviders(@PathVariable String zip) {

		List<HealthCareProvider> hcps = new ArrayList<HealthCareProvider>();
		
		HealthCareProvider hcp1 = new HealthCareProvider(1,"Kaiser");
		HealthCareProvider hcp2 = new HealthCareProvider(2,"Anthem");
		HealthCareProvider hcp3 = new HealthCareProvider(3,"Blue Cross");
		
		hcps.add(hcp1);
		hcps.add(hcp2);
		hcps.add(hcp3);
		
		return hcps;

	}

}