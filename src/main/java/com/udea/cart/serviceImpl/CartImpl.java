package com.udea.cart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.udea.cart.json.JsonConvert;
import com.udea.cart.model.Cart;
import com.udea.cart.repository.ICartJpaRepository;
import com.udea.cart.service.CartService;

@Service
public class CartImpl implements CartService {

	private static final String CARRITO_NO_EXISTE = "Carrito no existe";
	@Autowired
	ICartJpaRepository iCartJpaRepository;

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

	@Override
	public void checkOutCart(String JsonProduct) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createCart(String persona) {
		// TODO Auto-generated method stub

	}

}
