package com.afrAsia.customexception;

public class StartDateSmallerException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public StartDateSmallerException() {
        super();
    }
	
	public StartDateSmallerException(String message) {
        super(message);
    }

}
