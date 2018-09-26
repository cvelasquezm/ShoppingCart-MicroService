package com.udea.cart.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cart.model.Product;

@RestController
@RequestMapping(path = "/shoppingcart")
public class ShoppingCartController {

	@RequestMapping(path = "/deleteProducto", method = RequestMethod.POST, produces = MediaType.APPLICATION_ATOM_XML_VALUE)
	public void deleteProduct(@RequestParam String JsonProduct) {
		try {
			Product p = new Product();
			p = p.setValuesFromJSON(JsonProduct);
			p.delete();
		}catch(Exception e) {
			
		}
	}
	
}
