package com.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{
	Role findByName(String name);

}
