package com.seriazle;

import java.io.Serializable;

public class Product implements Serializable {

	int product_id;
	String product_name;
	int category_id;
	int availabe_quantity;
	int price;
	
	public Product(int product_id, String product_name, int category_id, int availabe_quantity, int price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.category_id = category_id;
		this.availabe_quantity = availabe_quantity;
		this.price = price;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getAvailabe_quantity() {
		return availabe_quantity;
	}

	public void setAvailabe_quantity(int availabe_quantity) {
		this.availabe_quantity = availabe_quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
