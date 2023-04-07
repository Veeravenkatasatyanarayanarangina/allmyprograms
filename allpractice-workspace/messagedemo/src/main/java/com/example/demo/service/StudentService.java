package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public interface StudentService {
	
	public Student save(Student student);
	public Student findById(int id);
	
	
	
	

}
