package com.udea.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.udea.cart.model.Product;

public interface IProductJpaRepository extends JpaRepository<Product, String> {
	
	@Query(value = "update products\r\n" + 
			"set count = ?1 \r\n" + 
			"where id_cart = ?2 \r\n" + 
			"and id_product = ?3 \r\n" + 
			"and (count > ?1 or count = ?1)", nativeQuery = true)
	void updateCountProduct(int count, long id_cart, String id_product);
	
}
