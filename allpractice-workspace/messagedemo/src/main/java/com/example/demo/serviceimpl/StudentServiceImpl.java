package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo studentrepo;

	@Override
	public Student save(Student student) {
		Student st =studentrepo.save(student);
		return st;
		
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
//		@SuppressWarnings("deprecation")
		Student st = studentrepo.findById(id).get();
		if(st != null)
		{
		return st;
		}
		else
		{
			throw new UserNotFoundException("user id is incorrect..");
		}
	}

}
