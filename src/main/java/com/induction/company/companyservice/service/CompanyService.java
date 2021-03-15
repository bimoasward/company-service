package com.induction.company.companyservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.induction.company.companyservice.dto.CompanyDTO;
import com.induction.company.companyservice.entity.Company;
import com.induction.company.companyservice.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public CompanyDTO getCompanyDTO(Company company) {
		return new CompanyDTO(company.getCompanyCode(), company.getName(), company.getAddress());
	}
	
	public CompanyDTO getById(String companyCode) {
		return getCompanyDTO(companyRepository.getOne(companyCode));
	}
}
