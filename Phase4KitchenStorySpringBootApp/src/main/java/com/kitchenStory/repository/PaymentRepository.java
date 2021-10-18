package com.kitchenStory.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitchenStory.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
	
}
