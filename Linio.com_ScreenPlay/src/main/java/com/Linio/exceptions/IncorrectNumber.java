package com.Linio.exceptions;

public class IncorrectNumber extends AssertionError{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public IncorrectNumber(String message, Throwable cause) {       
        super(message, cause);
    }
	


	public static String getmessagestart() {
		// TODO Auto-generated method stub
		return String.format("Numero De Index Para Localizar El Producto Es Incorrecto");
	}
}
