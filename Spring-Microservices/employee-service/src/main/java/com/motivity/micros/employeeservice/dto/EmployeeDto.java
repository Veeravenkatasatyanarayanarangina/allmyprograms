package com.motivity.micros.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
