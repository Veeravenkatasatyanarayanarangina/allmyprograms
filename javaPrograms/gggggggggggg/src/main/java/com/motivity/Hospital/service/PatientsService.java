package com.motivity.Hospital.service;

import org.springframework.stereotype.Service;
import com.motivity.Hospital.models.Patients;
@Service
public interface PatientsService {

	Patients savePatients(Patients patients);
	
	Patients loginPatient(String email,String password);

}
