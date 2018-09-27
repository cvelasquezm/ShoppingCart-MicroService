package com.udea.cart.service;

public interface Cart {
	
	public void cleanCart(String JsonProduct);
	
	public void getCart(String JsonProduct);
	
	public void checkOutCart(String JsonProduct);
		
	public void createCart(String persona);
	
		
}
