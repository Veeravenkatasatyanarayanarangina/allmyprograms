package com.motivity.micros.employeeservice.repository;

import com.motivity.micros.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

     Employee save(Employee employee);
    Optional<Employee> findById(Long id);


}
