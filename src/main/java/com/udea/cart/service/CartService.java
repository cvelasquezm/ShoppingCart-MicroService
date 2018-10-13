package com.udea.cart.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.udea.cart.model.Cart;
import com.udea.cart.model.Product;

public interface CartService {
	
	public void cleanCart(String idCart);
	
	public String getCart(String idCart) throws JsonProcessingException;
	
	public void checkOutCart(String cartId);

    void addProduct(Product product);
		
}
