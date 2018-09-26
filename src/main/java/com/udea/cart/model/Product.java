package com.udea.cart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="products")
public class Product implements Serializable {
	
	@Id
	@Column(name="idProduct")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String idProduct;
	
	@Column(name="count")
	private int count;
	
	@Column(name="price")
	private double price;
	
	
	public Product() {
		
	}
	
	public Product(String idProduct, int count, double price) {
		super();
		this.idProduct = idProduct;
		this.count = count;
		this.price = price;
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
	
}
