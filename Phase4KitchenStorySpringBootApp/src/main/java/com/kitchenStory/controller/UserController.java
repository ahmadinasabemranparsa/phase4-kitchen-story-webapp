package com.kitchenStory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStory.model.User;
import com.kitchenStory.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("all")
	public List<User> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}
	
	@PostMapping("add")
	public User addUser(@RequestBody(required = false) User user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("delete")
	public void deleteUserDetails() {
		userRepository.deleteAll();
	}
}
