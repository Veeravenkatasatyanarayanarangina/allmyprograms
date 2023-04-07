package com.motivity.Hospital.repositorys;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.motivity.Hospital.models.Patients;



public interface PatientRepo extends CrudRepository<Patients, Integer>{

	@Query("select p from Patients p where p.email=:email and p.password=:password")
	public Patients loginPatient(String email,String password);
	
}
