package com.hcl.gl.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.gl.entity.FoodItems;
import com.hcl.gl.entity.Orders;
import com.hcl.gl.entity.User;
import com.hcl.gl.repository.FoodItemsRepository;
import com.hcl.gl.repository.UserRepository;

public class UserService 
{
	@Autowired
	FoodItemsRepository foodItemsRepository;
	UserRepository userRepository;
	
	public List<FoodItems> getFoodItems()
	{

		return foodItemsRepository.findAll();
	}

	public User placeOrder(int userid, Orders orders) {
		User user = userRepository.findById(userid).get();
		List<Orders> l = user.getOrders();
		if(l.size()>=1)
			l.add(orders);
		else {
			l=new ArrayList<Orders>();
			l.add(orders);
		}
		user.setOrders(l);
		userRepository.save(user);
		return user;
	}

	public User getUserById(int userid) {
		return userRepository.findById(userid).get();
	}

	public List<Orders> getOrdersById(int foodId) {
		User user = userRepository.findById(foodId).get();
		return user.getOrders();
	}

}
