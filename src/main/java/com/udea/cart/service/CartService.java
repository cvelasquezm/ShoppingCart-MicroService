package com.udea.cart.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface CartService {
	
	public void cleanCart(String idCart);
	
	public String getCart(String idCart) throws JsonProcessingException;
	
	public void checkOutCart(String JsonProduct);
		
	public void createCart(String persona);
	
		
}
