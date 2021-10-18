package com.kitchenStory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStory.model.Cart;
import com.kitchenStory.repository.CartRepository;

@RestController
@RequestMapping("cart")
public class CartController {
	@Autowired
	CartRepository cartRepository;
	
	@GetMapping("all")
	public List<Cart> getAllFoodsFromCart() {
		List<Cart> users = (List<Cart>) cartRepository.findAll();
		return users;
	}
	
	@PostMapping("add")
	public Cart addFoodToCart(@RequestBody(required = false) Cart foodCartItem) {
		return cartRepository.save(foodCartItem);
	}
	
	@DeleteMapping("delete")
	public void deleteAllFoodsFromCart() {
		cartRepository.deleteAll();
	}
}
