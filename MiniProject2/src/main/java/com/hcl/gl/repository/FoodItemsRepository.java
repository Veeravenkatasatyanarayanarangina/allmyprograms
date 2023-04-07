package com.hcl.gl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.gl.entity.FoodItems;

@Repository
public interface FoodItemsRepository extends JpaRepository<FoodItems, Integer>
{

	FoodItems deleteFoodItemsById(int foodId);

}
