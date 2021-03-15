package com.induction.company.companyservice.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.induction.company.companyservice.dto.UserDTO;

@FeignClient(name = "user-service")
public interface UserServiceFeign {

	@GetMapping("/api/v1/user-service/{id}")
	UserDTO getById(@PathVariable(value = "id") Long id);
}
