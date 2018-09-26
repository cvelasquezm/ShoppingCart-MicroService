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

	@RequestMapping(path = "/deleteProducto", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteProduct(@RequestParam String JsonProduct) {
		try {
			Product p = new Product();
			p = p.setValuesFromJSON(JsonProduct);
			p.delete();
		}catch(Exception e) {
			
		}
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/addProduct", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addProduct(@RequestParam String JsonProduct) {
	
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/deleteProducto", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void cleanCar(@RequestParam String JsonProduct) {
	
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/getCar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public void getCar(@RequestParam String JsonProduct) {
	
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/checkOutcar", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void checkOutcar(@RequestParam String JsonProduct) {
	
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/CreateCar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void CreateCar(@RequestParam String persona) {
	
	}
	
}
