package com.udea.cart.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Cart {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private String id;
	
	@Column
	private List<Product> products;
	
	@Column
	private String person;
	
	
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public List<Product> getProducts() {
		return products;
	}
	
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	public String getPerson() {
		return person;
	}
	
	
	public void setPerson(String person) {
		this.person = person;
	}
	
}