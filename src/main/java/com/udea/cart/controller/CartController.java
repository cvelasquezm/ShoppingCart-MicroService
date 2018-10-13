package com.udea.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.udea.cart.model.Product;
import com.udea.cart.service.CartService;
@RestController
@RequestMapping(path = "/shoppingcart")
public class CartController {

	@Autowired
	CartService ICart;
	

	/** TO-DO*/
	@DeleteMapping(path = "/cleanCart", produces = MediaType.APPLICATION_JSON_VALUE)
	public void cleanCart(@RequestParam String JsonProduct) {
	
		ICart.cleanCart(JsonProduct);
		
	}
	
	/** TO-DO*/
	@GetMapping(path = "/getCart",  produces = MediaType.APPLICATION_JSON_VALUE)
	public void getCart(@RequestParam String JsonProduct) {
	
		try {
			ICart.getCart(JsonProduct);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/** TO-DO*/
	@PutMapping(path = "/checkOutCart", produces = MediaType.APPLICATION_JSON_VALUE)
	public void checkOutCart(@RequestParam String cartId) {
	
		ICart.checkOutCart(cartId);	
	}
	
	/** TO-DO*/
	@PostMapping(path = "/addProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public void addProduct(@RequestBody Product product) {
	
		ICart.addProduct(product);
		
	}

	
	
	
}
