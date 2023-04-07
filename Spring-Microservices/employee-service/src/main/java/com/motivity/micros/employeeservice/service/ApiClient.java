package com.motivity.micros.employeeservice.service;

import com.motivity.micros.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface ApiClient {
    @GetMapping("/findbydept/{id}")
    DepartmentDto findById(@PathVariable("id") long id);
}
