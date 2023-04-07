package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.serviceimpl.StudentServiceImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/")
	public String hello()
	{
		return "hai";
	}
	
	@PostMapping(value = "/register")
	public Student saveStudent(@RequestBody Student student)
	{
		
		return studentServiceImpl.save(student);
	}
	@GetMapping("/sid")
	public ResponseEntity<Student> findStudent(@RequestParam(name = "id") String id)
	{
		
		int idi = Integer.parseInt(id);
		System.out.println(idi);
		Student st = studentServiceImpl.findById(idi);
		System.out.println("hai");
		return new ResponseEntity<Student>(st, HttpStatus.OK);
	}
	
	

}
