package com.motivity.Hospital.service;

import org.springframework.stereotype.Service;

import com.motivity.Hospital.models.Doctors;
@Service
public interface DoctorService {

	Doctors saveDoctor(Doctors doctor);
	
	Doctors loginDoctor(String email,String password);

}
