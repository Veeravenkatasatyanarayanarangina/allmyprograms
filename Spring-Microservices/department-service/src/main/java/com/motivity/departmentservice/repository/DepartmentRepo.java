package com.motivity.departmentservice.repository;

import com.motivity.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {

    public Department findById(long id);
    public Department save(Department department);


}
