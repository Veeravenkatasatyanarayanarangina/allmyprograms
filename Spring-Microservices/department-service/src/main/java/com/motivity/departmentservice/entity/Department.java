package com.motivity.departmentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedNativeQuery(name = "getDepartments",query = "select * from department", resultClass = Department.class)
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;


}
