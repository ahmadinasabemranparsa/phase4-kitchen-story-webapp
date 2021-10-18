package com.kitchenStory.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kitchenStory.model.Food;

public interface FoodRepository extends CrudRepository<Food, Integer> {
	@Query(value = "SELECT * FROM food WHERE food_name = :food_name", nativeQuery=true)
	public Optional<Food> getFoodByName(@Param("food_name") String food_name);
}
