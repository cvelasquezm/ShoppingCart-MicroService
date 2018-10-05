package com.udea.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cart.service.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	ProductService IProduct;
	
	@DeleteMapping(path = "/deleteProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteProduct(@RequestParam String JsonProduct) {
		/*try {
			Product p = new Product();
			p = p.setValuesFromJSON(JsonProduct);
			p.delete();
		}catch(Exception e) {
			
		}*/
		IProduct.deleteProduct(JsonProduct);
	}
	
	/** TO-DO*/
	@PutMapping(path = "/addProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public void addProduct(@RequestParam String JsonProduct) {
	
		IProduct.addProduct(JsonProduct);
		
	}
		
}
