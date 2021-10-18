package com.kitchenStory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "food_cart_id")
	private int food_cart_id;
	
	@Column(name = "food_cart_name")
	private String food_cart_name;
	
	@Column(name = "food_cart_price")
	private int food_cart_price;
	
	@Column(name = "food_cart_category")
	private String food_cart_category;

	public int getFood_cart_id() {
		return food_cart_id;
	}

	public void setFood_cart_id(int food_cart_id) {
		this.food_cart_id = food_cart_id;
	}

	public String getFood_cart_name() {
		return food_cart_name;
	}

	public void setFood_cart_name(String food_cart_name) {
		this.food_cart_name = food_cart_name;
	}

	public int getFood_cart_price() {
		return food_cart_price;
	}

	public void setFood_cart_price(int food_cart_price) {
		this.food_cart_price = food_cart_price;
	}

	public String getFood_cart_category() {
		return food_cart_category;
	}

	public void setFood_cart_category(String food_cart_category) {
		this.food_cart_category = food_cart_category;
	}
}
