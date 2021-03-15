package com.induction.company.companyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.induction.company.companyservice.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {

}
