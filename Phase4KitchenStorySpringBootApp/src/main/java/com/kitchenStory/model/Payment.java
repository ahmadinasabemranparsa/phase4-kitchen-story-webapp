package com.kitchenStory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "payment_id")
	private int payment_id;
	
	@Column(name = "payment_credit_card_number")
	private String payment_credit_card_number;
	
	@Column(name = "payment_name_on_credit_card")
	private String payment_name_on_credit_card;
	
	@Column(name = "payment_expiration_date")
	private String payment_expiration_date;

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public String getPayment_credit_card_number() {
		return payment_credit_card_number;
	}

	public void setPayment_credit_card_number(String payment_credit_card_number) {
		this.payment_credit_card_number = payment_credit_card_number;
	}

	public String getPayment_name_on_credit_card() {
		return payment_name_on_credit_card;
	}

	public void setPayment_name_on_credit_card(String payment_name_on_credit_card) {
		this.payment_name_on_credit_card = payment_name_on_credit_card;
	}

	public String getPayment_expiration_date() {
		return payment_expiration_date;
	}

	public void setPayment_expiration_date(String payment_expiration_date) {
		this.payment_expiration_date = payment_expiration_date;
	}
}
