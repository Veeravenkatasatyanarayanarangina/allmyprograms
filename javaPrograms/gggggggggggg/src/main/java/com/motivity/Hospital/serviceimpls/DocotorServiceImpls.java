package com.motivity.Hospital.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motivity.Hospital.models.Doctors;
import com.motivity.Hospital.repositorys.DoctorRepo;
import com.motivity.Hospital.service.DoctorService;
@Service
public class DocotorServiceImpls implements DoctorService{

	@Autowired
	DoctorRepo doctorRepo;
	
	@Override
	public Doctors loginDoctor(String email, String password) {
		
		return doctorRepo.loginDoctor(email, password);
	}

	@Override
	public Doctors saveDoctor(Doctors doctor) {
		
		return doctorRepo.save(doctor);
	}

}
