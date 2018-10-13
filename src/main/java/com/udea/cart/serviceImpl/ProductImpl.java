package com.udea.cart.serviceImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.udea.cart.json.JsonConvert;
import com.udea.cart.model.Cart;
import com.udea.cart.model.Product;
import com.udea.cart.repository.ICartJpaRepository;
import com.udea.cart.repository.IProductJpaRepository;
import com.udea.cart.service.ProductService;

@Service
public class ProductImpl implements ProductService{
    
    @Autowired
    IProductJpaRepository productJpaRepository;
    
    
	@Override
	public void deleteProduct(String jsonproduct) throws JsonProcessingException, IOException {
		Product product = JsonConvert.JsonToProduct(jsonproduct);
		CartImpl cartImpl = new CartImpl();
		if (cartImpl.cartExists(product.getIdCart().toString())) {
			productJpaRepository.updateCountProduct(product.getCount(), product.getIdCart(), product.getIdProduct());
		}
				
		
		
	}

	@Override
	public void addProduct(Product product) {
	    productJpaRepository.save(product);
	    productJpaRepository.flush();
		
	}

}
