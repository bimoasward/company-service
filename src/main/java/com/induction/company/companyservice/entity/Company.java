package com.induction.company.companyservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "company")
public class Company {

	@Id
	@Column(name = "company_code")
	private String companyCode;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
}
