package com.motivity.departmentservice.service;

import com.motivity.departmentservice.dto.DepartmentDto;
import com.motivity.departmentservice.entity.Department;
import com.motivity.departmentservice.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl {

    @Autowired
    private DepartmentRepo departmentRepo;

    public DepartmentDto saveDepartment(DepartmentDto dto)
    {
//      dto  departmentRepo.
        return entityToDto(departmentRepo.save(dtoToEntity(dto)));
    }
    public DepartmentDto findByDeptId(Long id)
    {
        return entityToDto(departmentRepo.findById(id).get());
    }


    public Department dtoToEntity(DepartmentDto dto)
    {
        Department department = new Department();
        department.setDepartmentDescription(dto.getDepartmentDescription());
        department.setDepartmentCode(dto.getDepartmentCode());
        department.setDepartmentName(dto.getDepartmentName());
        return department;
    }
    public DepartmentDto entityToDto(Department department)
    {
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(department.getId());
        departmentDto.setDepartmentName(department.getDepartmentName());
        departmentDto.setDepartmentDescription(department.getDepartmentDescription());
        departmentDto.setDepartmentCode(department.getDepartmentCode());
        return  departmentDto;
    }

}
