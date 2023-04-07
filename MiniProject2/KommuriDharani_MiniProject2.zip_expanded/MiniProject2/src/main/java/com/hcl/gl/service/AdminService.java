package com.hcl.gl.service;

import java.time.LocalDate;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.gl.entity.Bills;
import com.hcl.gl.entity.FoodItems;
import com.hcl.gl.entity.Orders;
import com.hcl.gl.entity.User;
import com.hcl.gl.repository.AdminRepository;
import com.hcl.gl.repository.BillsRepository;
import com.hcl.gl.repository.FoodItemsRepository;
import com.hcl.gl.repository.OrdersRepository;
import com.hcl.gl.repository.UserRepository;

@Service
public class AdminService 
{
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	FoodItemsRepository foodItemsRepository;
	@Autowired
	BillsRepository billsRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	OrdersRepository ordersRepository;

	public FoodItems addFoodItems(FoodItems foodItems)
	{
		return foodItemsRepository.save(foodItems);
	}

	public FoodItems getFoodItemsById(int foodId)
	{
		return foodItemsRepository.findById(foodId).get();

	}

	public FoodItems updateFoodItems(FoodItems foodItems) {
		return foodItemsRepository.save(foodItems);
	}

	public FoodItems deleteFoodItemsById(int foodId)
	{
		return foodItemsRepository.deleteFoodItemsById(foodId);
	}

	public User getUserById(int userid)
	{
		return userRepository.findById(userid).get();

	}

	public void saveOrUpdate(User user)
	{
		userRepository.save(user);
	}

	public void deleteUser(int userid)
	{
		userRepository.deleteById(userid);
	}

	public List<Orders> getAllOrders()
	{
		List<Orders> orders = ordersRepository.findAll();
		return orders;
	}
	
	public List<Orders> getOrdersById(int userid) {
		User user = userRepository.findById(userid).get();
		return user.getOrders();
	}
	
	public List<Bills> getBills(LocalDate date)
	{
		return billsRepository.findByDate(date);
	}
}
