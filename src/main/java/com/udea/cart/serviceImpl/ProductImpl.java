package com.udea.cart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.cart.model.Product;
import com.udea.cart.repository.IProductJpaRepository;
import com.udea.cart.service.ProductService;

@Service
public class ProductImpl implements ProductService{
    
    @Autowired
    IProductJpaRepository productJpaRepository;
    
	@Override
	public void deleteProduct(String JsonProduct) {
		//TODO Debe comunicarse con el inventario para decirle 
		// q el producto separados lo libere
		
	}

	@Override
	public void addProduct(Product product) {
	    productJpaRepository.save(product);
	    productJpaRepository.flush();
		
	}

}
