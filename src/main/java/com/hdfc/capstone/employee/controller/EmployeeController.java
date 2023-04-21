package com.hdfc.capstone.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.capstone.employee.dto.EmployeeDTO;
import com.hdfc.capstone.employee.exception.InvalidEmployeeIdException;
import com.hdfc.capstone.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	IEmployeeService service;
	public EmployeeDTO getEmployeebyId(long employeeId) throws InvalidEmployeeIdException {
		
		return service.getEmployee(employeeId);
	}
}
