package com.motivity.departmentservice.controller;

import com.motivity.departmentservice.dto.DepartmentDto;
import com.motivity.departmentservice.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentServiceImpl departmentService;

    @PostMapping("/savedepartment")
    public ResponseEntity<?> saveDepartment(@RequestBody  DepartmentDto departmentDto)
    {
        System.out.println(departmentDto.toString());
        DepartmentDto dto = departmentService.saveDepartment(departmentDto);
        return  new ResponseEntity<>(dto, HttpStatus.OK);
    }
    @GetMapping("/findbydept/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") long id)
    {
        DepartmentDto dto = departmentService.findByDeptId(id);
        return  new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @GetMapping("/hai")
    public String hello()
    {
        return "satya";
    }
}
