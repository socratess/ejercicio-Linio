package com.Linio.exceptions;

public class NoFoundAnyElement extends AssertionError{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public NoFoundAnyElement(String message, Throwable cause) {       
        super(message, cause);
    }
	


	public static String getmessagestart() {
		// TODO Auto-generated method stub
		return String.format("No Hay Conexión A La Red");
	}
}
