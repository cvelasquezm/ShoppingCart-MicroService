package com.udea.cart.service;

import com.udea.cart.model.Product;

public interface ProductService {
	
	public void deleteProduct(String JsonProduct);

    void addProduct(Product product);
	
}
