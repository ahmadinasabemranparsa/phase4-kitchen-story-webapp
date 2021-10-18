package com.kitchenStory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenStory.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
	
}
