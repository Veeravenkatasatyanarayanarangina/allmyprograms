package com.motivity.micros.employeeservice.dto;

import com.motivity.micros.employeeservice.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEmployeeDto {

    private EmployeeDto employee;
    private DepartmentDto department;

}
