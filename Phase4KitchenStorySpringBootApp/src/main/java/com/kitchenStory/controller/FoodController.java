package com.kitchenStory.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStory.model.Food;
import com.kitchenStory.repository.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {
	@Autowired
	FoodRepository foodRepository;
	
	@GetMapping("all")
	public List<Food> getAllFoods() {
		List<Food> users = (List<Food>) foodRepository.findAll();
		return users;
	}
	
	@PostMapping("add")
	public Food addFood(@RequestBody(required = false) Food food) {
		return foodRepository.save(food);
	}
	
	@GetMapping("foods1/{food_name}")
	public Optional<Food> getFoodByName(@PathVariable String food_name) {
		return foodRepository.getFoodByName(food_name);
	}
	
	@DeleteMapping("foods2/delete/{id}")
	public void deleteFood(@PathVariable int food_id) {
		foodRepository.deleteById(food_id);
	}
}
