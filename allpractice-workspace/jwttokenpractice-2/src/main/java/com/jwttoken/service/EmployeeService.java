package com.jwttoken.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.jwttoken.model.Employee;
import com.jwttoken.repository.EmployeeRepository;


public interface EmployeeService {
	
	
	
	public Employee employeeregister(Employee employee);
	

	public Employee employeeLoginData(String userName,String Password);
	

}
