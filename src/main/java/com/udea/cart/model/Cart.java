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
@Table(name="cart")	
public class Cart implements Serializable {

	@Id
	@Column(name="idCart")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long idCart;
	

	//private List<Product> products;
	
	@Column(name="idPerson")
	private String idPerson;


	public Cart(Long idCart, String idPerson) {
		super();
		this.idCart = idCart;
		this.idPerson = idPerson;
	}	
	public Cart() {
			
	}
	public Long getIdCart() {
		return idCart;
	}
	public void setIdCart(Long idCart) {
		this.idCart = idCart;
	}
	public String getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}	
	
}