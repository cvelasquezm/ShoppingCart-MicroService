package com.udea.cart.model;

import com.google.gson.Gson;

public class Product {
	
	private String idProduct;
	private int count;
	private double price;
	
	
	public Product() {
		
	}
	
	
	public String getIdProduct() {
		return idProduct;
	}
	
	
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	
	
	public int getCount() {
		return count;
	}
	
	
	public void setCount(int count) {
		this.count = count;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Product setValuesFromJSON(String JsonString) {
		Gson gson = new Gson();
		return gson.fromJson(JsonString, this.getClass());
	}
	
	public void delete() {
		
	}
	
}
