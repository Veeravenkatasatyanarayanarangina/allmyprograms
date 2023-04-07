package com.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	Optional<Users> findBYEmail(String email);

}
