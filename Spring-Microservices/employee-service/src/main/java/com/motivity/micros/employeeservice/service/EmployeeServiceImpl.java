package com.motivity.micros.employeeservice.service;

import com.motivity.micros.employeeservice.dto.EmployeeDto;
import com.motivity.micros.employeeservice.entity.Employee;
import com.motivity.micros.employeeservice.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeDto saveEmployee(EmployeeDto employeeDto){
        return entityToDto(employeeRepo.save(dtoToEntity(employeeDto)));
    }
    public EmployeeDto findById(long id)
    {
//        return entityToDto(employeeRepo.findById(id).get());
        employeeRepo.flush();
        return entityToDto(employeeRepo.findById(id).get());
    }


    public Employee dtoToEntity(EmployeeDto employeeDto)
    {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        return employee;
    }
    public EmployeeDto entityToDto(Employee employee)
    {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setEmail(employee.getEmail());
        return employeeDto;
    }
}
