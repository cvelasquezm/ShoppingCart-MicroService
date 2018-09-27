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

	@RequestMapping(path = "/deleteProduct", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteProduct(@RequestParam String JsonProduct) {
		/*try {
			Product p = new Product();
			p = p.setValuesFromJSON(JsonProduct);
			p.delete();
		}catch(Exception e) {
			
		}*/
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/addProduct", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addProduct(@RequestParam String JsonProduct) {
	
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/cleanCart", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void cleanCart(@RequestParam String JsonProduct) {
	
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/getCart", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public void getCart(@RequestParam String JsonProduct) {
	
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/checkOutCart", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void checkOutCart(@RequestParam String JsonProduct) {
	
	}
	
	/** TO-DO*/
	@RequestMapping(path = "/CreateCart", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void CreateCart(@RequestParam String persona) {
	
	}
	
}
