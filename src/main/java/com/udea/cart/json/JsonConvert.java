package com.udea.cart.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.udea.cart.model.Cart;
import com.udea.cart.model.Product;

public class JsonConvert {

	public static String objectJson(Object object) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(object);
	}
	
	public static Product JsonToProduct(String json) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Product product = mapper.readValue(json, Product.class);
		return product;
	}
	
	public static Cart JsonToCart(String json) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Cart cart = mapper.readValue(json, Cart.class);
		return cart;
	}
}
