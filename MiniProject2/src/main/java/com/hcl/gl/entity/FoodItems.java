package com.hcl.gl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "FoodItemTable")
public class FoodItems {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int foodId;
	private String foodItemName;
	private int foodItemPrice;
	private int noOfplates;

	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodItemName() {
		return foodItemName;
	}
	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}
	public int getFoodItemPrice() {
		return foodItemPrice;
	}
	public void setFoodItemPrice(int foodItemPrice) {
		this.foodItemPrice = foodItemPrice;
	}
	public int getNoOfplates() {
		return noOfplates;
	}
	public void setNoOfplates(int noOfplates) {
		this.noOfplates = noOfplates;
	}

}

