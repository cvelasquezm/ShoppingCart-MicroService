package com.udea.cart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="products")
public class Product implements Serializable {
	
	@Id
	@Column(name="idProduct", length = 10)
	private String idProduct;
	
	@Column(name="idCart")
    private Long idCart;
	
	@Column(name="count")
	private int count;
	
	@Column(name="price")
	private double price;
	
	
	public Product() {
		
	}
	
	public Product(String idProduct, int count, double price,Long idCart) {
		super();
		this.idProduct = idProduct;
		this.count = count;
		this.price = price;
		this.idCart = idCart;
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

    public Long getIdCart() {
        return idCart;
    }

    public void setIdCart(Long idCart) {
        this.idCart = idCart;
    }
	
	
	
}
