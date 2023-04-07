package com.motivity.micros.employeeservice.controller;

import com.motivity.micros.employeeservice.dto.DepartmentDto;
import com.motivity.micros.employeeservice.dto.EmployeeDto;
import com.motivity.micros.employeeservice.dto.ResponseEmployeeDto;
import com.motivity.micros.employeeservice.service.ApiClient;
import com.motivity.micros.employeeservice.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl service;

    @Autowired
    ApiClient apiClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hai")
    public String getm()
    {
        return "satya";
    }

    @PostMapping("/saveemployee")
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeDto dto)
    {
        EmployeeDto respdto = service.saveEmployee(dto);
        return new ResponseEntity<>(respdto, HttpStatus.OK);
    }
    @GetMapping("/getemployee/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable("id") long id)
    {


        EmployeeDto response = service.findById(id);


/*
        DepartmentDto dto=restTemplate.getForObject("http://localhost:9002/findbydept/{id}", DepartmentDto.class,4);
*/
        DepartmentDto dto = apiClient.findById(response.getId());
        return new ResponseEntity<>(new ResponseEmployeeDto(response,dto),HttpStatus.OK);
    }




}
