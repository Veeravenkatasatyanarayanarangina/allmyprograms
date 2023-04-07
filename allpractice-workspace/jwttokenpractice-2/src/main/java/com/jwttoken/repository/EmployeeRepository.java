package com.jwttoken.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jwttoken.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	@Query("select a from Employee a where a.username = :userName and a.password = :Password")
	public Employee employeeLogin(String userName,String Password);
	

}
