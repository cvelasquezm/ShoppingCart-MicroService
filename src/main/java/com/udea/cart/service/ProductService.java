package com.udea.cart.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.udea.cart.model.Product;

public interface ProductService {
	
	public void deleteProduct(String JsonProduct) throws JsonProcessingException, IOException;

    void addProduct(Product product);
	
}
