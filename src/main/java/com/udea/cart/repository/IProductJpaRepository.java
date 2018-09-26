package com.udea.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udea.cart.model.Product;

public interface IProductJpaRepository extends JpaRepository<Product, String> {
	
}
