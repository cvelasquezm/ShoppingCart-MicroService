package com.udea.cart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.udea.cart.json.JsonConvert;
import com.udea.cart.model.Cart;
import com.udea.cart.model.Product;
import com.udea.cart.repository.ICartJpaRepository;
import com.udea.cart.service.CartService;
import com.udea.cart.service.ProductService;
import com.udea.kafka.Producer;

@Service
public class CartImpl implements CartService {

	private static final String CARRITO_NO_EXISTE = "Carrito no existe";
	
	@Autowired
	ICartJpaRepository iCartJpaRepository;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	Producer producer;
	

	@Override
	public void cleanCart(String idCart) {

		Cart cart = iCartJpaRepository.findByIdCart(idCart);

		if (cartIsNotNull(cart)) {

			iCartJpaRepository.delete(cart);

		}

	}

	private boolean cartIsNotNull(Cart cart) {
		return cart != null;
	}

	@Override
	public String getCart(String idCart) throws JsonProcessingException {

		Cart cart = iCartJpaRepository.findByIdCart(idCart);

		if (cartIsNotNull(cart)) {
			
			return JsonConvert.objectJson(cart);

		}
		
		return CARRITO_NO_EXISTE;
	}
	
	public boolean cartExists(String idCart) throws JsonProcessingException {

		Cart cart = iCartJpaRepository.findByIdCart(idCart);

		if (cartIsNotNull(cart)) {
			
			return true;

		}
		
		return false;
	}
	
	
	@Override
	public void checkOutCart(String cartId) {
		
		Cart cart = iCartJpaRepository.findByIdCart(cartId);

		if (cartIsNotNull(cart)) {
			
			producer.publishEvent(cart);

		}
		
		
	}

	private Long createCart(String idPersona) {
	    Cart cart = new Cart();
	    cart.setIdPerson(idPersona);
	    cart=iCartJpaRepository.save(cart);
	    return cart.getIdCart();

	}
	
	@Override
	public void addProduct(Product product){
	    if(product.getIdCart()==null ){
	        product.setIdCart(createCart("persona")); 
	    }	    
	    productService.addProduct(product);
	}

}
