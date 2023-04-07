package com.jwttoken.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwttoken.model.Employee;
import com.jwttoken.repository.EmployeeRepository;
import com.jwttoken.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepository repository;

	@Override
	public Employee employeeregister(Employee employee) {
		
		return repository.save(employee);
	}



	@Override
	public Employee employeeLoginData(String userName, String Password) {
		// TODO Auto-generated method stub
		return repository.employeeLogin(userName, Password);
	}
	

}
