package com.tritl.firefly.rest.mvc.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tritl.firefly.model.Doctor;

@Controller
@RequestMapping("/pcps")
public class PCPController {

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody
	List<Doctor> getShopInJSON(@PathVariable String name) {

	List<Doctor> pcps = new ArrayList<Doctor>();
	
	return pcps;

	}

}