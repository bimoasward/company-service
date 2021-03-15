package com.induction.company.companyservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.induction.company.companyservice.dto.CompanyDTO;
import com.induction.company.companyservice.dto.UserDTO;
import com.induction.company.companyservice.feignService.UserServiceFeign;
import com.induction.company.companyservice.service.CompanyService;

@RestController
@RequestMapping("/get")
public class CompanyController {

	@Autowired
	private UserServiceFeign userServiceFeign;
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/user/{id}")
	public UserDTO getById(@PathVariable(value = "id") Long id) {
		return userServiceFeign.getById(id);
	}
	
	@GetMapping(value = "/{CompanyCode}")
	public CompanyDTO getUserById(@PathVariable(value = "CompanyCode") String CompanyCode) {
		return companyService.getById(CompanyCode);
	}
}
