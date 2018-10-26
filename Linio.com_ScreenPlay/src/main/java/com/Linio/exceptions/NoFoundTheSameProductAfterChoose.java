package com.Linio.exceptions;

public class NoFoundTheSameProductAfterChoose extends AssertionError {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public NoFoundTheSameProductAfterChoose(String message, Throwable cause) {       
        super(message, cause);
    }
	


	public static String getmessagestart() {
		// TODO Auto-generated method stub
		return String.format("El producto no es el seleccionado, inconcordancia de los productos");
	}
}
