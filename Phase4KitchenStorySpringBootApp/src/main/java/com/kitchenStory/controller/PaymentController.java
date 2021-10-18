package com.kitchenStory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStory.model.Payment;
import com.kitchenStory.repository.PaymentRepository;

@RestController
@RequestMapping("payment")
public class PaymentController {
	@Autowired
	PaymentRepository paymentRepository;
	
	@GetMapping("all")
	public List<Payment> getPaymentDetails() {
		List<Payment> paymentDetails = (List<Payment>) paymentRepository.findAll();
		return paymentDetails;
	}
	
	@PostMapping("add")
	public Payment addPaymentDetails(@RequestBody(required = false) Payment payment) {
		return paymentRepository.save(payment);
	}
	
	@DeleteMapping("delete")
	public void deletePaymentDetails() {
		paymentRepository.deleteAll();
	}
}
