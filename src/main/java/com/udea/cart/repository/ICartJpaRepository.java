package com.udea.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.udea.cart.model.Cart;

public interface ICartJpaRepository  extends JpaRepository<Cart, String> {

    
	void deleteByIdCart(String idCart);
	
	Cart findByIdCart(String idCart);
	

	
}
