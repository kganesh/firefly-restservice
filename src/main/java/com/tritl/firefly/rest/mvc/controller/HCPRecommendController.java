package com.tritl.firefly.rest.mvc.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tritl.firefly.model.Doctor;
import com.tritl.firefly.model.InsuranceProvider;
import com.tritl.firefly.service.FireflyDataServices;

@Controller
@RequestMapping("/hcprecommend")
public class HCPRecommendController {
	
	private FireflyDataServices fireflyDataService;

	@Autowired
	public void setFireflyDataService(FireflyDataServices fireflyDataService) {
		this.fireflyDataService = fireflyDataService;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	List<InsuranceProvider> getHCPRecommendList(@RequestParam(value = "dob") String dob,
			@RequestParam(value = "zip") String zip,
			@RequestParam(value = "provider") String provider,
			@RequestParam(value = "diseases") String[] diseases) {

		
		return fireflyDataService.getHCPRecommendList(dob, zip, provider, diseases);
		
	}

}