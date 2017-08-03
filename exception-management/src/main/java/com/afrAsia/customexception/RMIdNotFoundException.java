package com.afrAsia.customexception;

public class RMIdNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public RMIdNotFoundException() {
        super();
    }
	
	public RMIdNotFoundException(String message) {
        super(message);
    }
}
