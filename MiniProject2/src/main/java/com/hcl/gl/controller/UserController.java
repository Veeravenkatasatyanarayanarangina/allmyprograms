package com.hcl.gl.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.gl.entity.Admin;
import com.hcl.gl.entity.FoodItems;
import com.hcl.gl.entity.Orders;
import com.hcl.gl.entity.User;
import com.hcl.gl.repository.UserRepository;
import com.hcl.gl.service.UserService;
public class UserController 
{
	@Autowired
	UserService userService;
	@Autowired
	UserRepository userRepository;

	@PostMapping("/register")
	public void registerUser(@RequestBody User newUser)
	{
		List<User> user = (List<User>) userRepository.findAll();
		System.out.println("New user:"+newUser.toString());
		for(User user1 : user )
		{
			if(user1.equals(newUser))
			{
				System.out.println("User exists!");
				return ;
			}
		}
	}

	@PostMapping("/login")
	public void loginUser(@RequestBody User user)
	{
		List <User> user1=(List<User>) userRepository.findAll();
		for(User loginuser:user1)
		{
			if(loginuser.equals(user1))
			{
				return;
			}
		}
	}

	@PostMapping("/logout")
	public void logoutUser(@RequestBody User user)
	{
		List <User> user1 = (List<User>) userRepository.findAll();
		for(User loginuser : user1)
		{
			if(loginuser.equals(user1))
			{
				return;
			}
		}
	}


	@GetMapping("/user/foodItems")
	public List<FoodItems> getFoodItems()
	{
		return userService.getFoodItems();
	}

	@PutMapping("/user/place-order/{userid}")
	public User placeOrder(@PathVariable int userid, @RequestBody Orders orders)
	{
		return userService.placeOrder(userid,orders);
	}

	@GetMapping("/user/by-userid/{userid}")
	public User getUserById(@PathVariable int userid)
	{
		return userService.getUserById(userid);
	}

	@GetMapping("/user/get-order-history/{userid}")
	public List<Orders> getOrdersById(@PathVariable int userid)
	{
		return userService.getOrdersById(userid);
	}

}
