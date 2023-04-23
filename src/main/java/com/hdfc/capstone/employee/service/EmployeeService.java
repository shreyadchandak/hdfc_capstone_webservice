package com.hdfc.capstone.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.capstone.employee.dto.EmployeeDTO;
import com.hdfc.capstone.employee.entity.Employee;
import com.hdfc.capstone.employee.exception.InvalidEmployeeIdException;
import com.hdfc.capstone.employee.repo.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Transactional
	public EmployeeDTO getEmployee(long employeeId) throws InvalidEmployeeIdException {
		

		Employee employee=employeeRepository.findByEmployeeId(employeeId);

		if(employee==null) {
			throw new InvalidEmployeeIdException();
		}
		
		return toDTO(employee);
	}
	
	public EmployeeDTO toDTO(Employee employee) {
		
		EmployeeDTO employeeDTO=new EmployeeDTO();
		employeeDTO.setEmployeeId(employee.getEmployeeId());
		employeeDTO.setEmployeeName(employee.getEmployeeName());
		employeeDTO.setDateOfBirth(employee.getDateOfBirth());
		return employeeDTO;
	}
}
