package com.udea.cart.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.udea.cart.service.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	ProductService IProduct;
	
	@DeleteMapping(path = "/deleteProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteProduct(@RequestParam String JsonProduct) {
		try {
			IProduct.deleteProduct(JsonProduct);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

		
}
