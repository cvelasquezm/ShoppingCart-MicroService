package com.udea.cart.serviceImpl;

import org.springframework.stereotype.Service;

import com.udea.cart.service.ProductService;

@Service
public class ProductImpl implements ProductService{

	@Override
	public void deleteProduct(String JsonProduct) {
		//TODO Debe comunicarse con el inventario para decirle 
		// q el producto separados lo libere
		
	}

	@Override
	public void addProduct(String JsonProduct) {
		//TODO Debe comunicarse con el inventario para decirle 
		// q separados el producto
		
	}

}
