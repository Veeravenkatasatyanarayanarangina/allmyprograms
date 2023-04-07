package com.jwt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.model.Role;
import com.jwt.model.User;
import com.jwt.repository.RoleRepo;
import com.jwt.repository.UserRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService
{
	@Autowired
	private final UserRepo userRepo;
	@Autowired
	private final RoleRepo roleRepo;
	
	

	@Override
	public User saveUser(User user) {
		log.info("saving new user{} to the database ",user.getName());
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		log.info("saving new role {} to the database ",role.getName());
		// TODO Auto-generated method stub
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
		// TODO Auto-generated method stub
		log.info("saving new role {} to user {} ",rolename,username);
		User user = userRepo.findByUsername(username);
		Role role = roleRepo.findByName(rolename);
		user.getRoles().add(role);
		
	}

	@Override
	public User getUser(String username) {
		log.info("fetching user {} ",username);
		// TODO Auto-generated method stub
		return userRepo.findByUsername(username);
	}

	@Override
	public List<User> getUsers() {
		log.info("fetching all  user ");
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
