package com.induction.company.companyservice.dto;

import lombok.Data;

@Data
public class CompanyDTO {

	private String companyCode;
	private String name;
	private String address;
	
	public CompanyDTO(String companyCode, String name, String address) {
		this.companyCode = companyCode;
		this.name = name;
		this.address = address;
	}
}
