package com.udea.cart.serviceImpl;

import org.springframework.stereotype.Service;

import com.udea.cart.service.Cart;

@Service
public class CartImpl implements Cart{

	@Override
	public void cleanCart(String JsonProduct) {
		// TODO Debe comunicarse con el inventario para decirle 
		// q los productos separados los libere
		
	}

	@Override
	public void getCart(String JsonProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkOutCart(String JsonProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCart(String persona) {
		// TODO Auto-generated method stub
		
	}

}
