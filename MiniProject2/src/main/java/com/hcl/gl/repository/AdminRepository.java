package com.hcl.gl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.gl.entity.*;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer>
{

}
