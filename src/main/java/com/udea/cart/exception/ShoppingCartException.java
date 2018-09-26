package com.udea.cart.exception;

@SuppressWarnings("serial")
public class ShoppingCartException extends Exception {
	public ShoppingCartException() {
		super();
	}
	public ShoppingCartException(String mensaje, Throwable e) {
      super(mensaje, e);
	}


}
