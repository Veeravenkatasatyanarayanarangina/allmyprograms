package com.motivity.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.motivity.model.RegisterUser;
@Repository
public interface UserRepository  extends CrudRepository<RegisterUser, Integer>{

	public RegisterUser findByEmail(String email);

}
