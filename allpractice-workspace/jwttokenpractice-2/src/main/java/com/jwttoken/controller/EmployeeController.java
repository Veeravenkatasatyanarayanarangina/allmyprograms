package com.jwttoken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jwttoken.model.Employee;
import com.jwttoken.model.Login;
import com.jwttoken.service.EmployeeService;
import com.jwttoken.utilities.JWTUtility;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private JWTUtility jwtUtility;
	
	@PostMapping("/savedata")
	public Employee employeeRegister( Employee employee)
	{
		Employee employee2=new Employee();
		employee2.setUsername(employee.getUsername());
		employee2.setPassword(employee.getPassword());
		employee2.setRole("user");
		Employee respEmployee = employeeService.employeeregister(employee2);
		return respEmployee;
		
	}
	@PostMapping("/checklogin")
	public String checkLogin(Login login)
	{
		Employee employee=employeeService.employeeLoginData(login.getUsername(), login.getPassword());
		if(employee!=null)
		{
			String token=jwtUtility.generateToken(employee);
		return token;
			
		}
		else
		{
			return null;
		}
		
		
	}
	
	@GetMapping("/login")
	public ModelAndView getLogin() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@GetMapping("/registration") 
	public ModelAndView getRegisterpage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("registration");
		return mv;
	}

}
