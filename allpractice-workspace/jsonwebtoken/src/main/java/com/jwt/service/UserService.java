package com.jwt.service;

import java.util.List;

import com.jwt.model.Role;
import com.jwt.model.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username,String rolename);
	User getUser(String username);
	List<User> getUsers(); 

}
