package com.kitchenStory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenStory.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
