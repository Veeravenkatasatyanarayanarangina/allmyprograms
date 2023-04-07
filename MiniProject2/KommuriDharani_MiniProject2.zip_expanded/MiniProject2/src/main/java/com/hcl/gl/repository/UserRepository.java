package com.hcl.gl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.gl.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{

}
