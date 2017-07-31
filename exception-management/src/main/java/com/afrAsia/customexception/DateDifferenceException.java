package com.afrAsia.customexception;

public class DateDifferenceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DateDifferenceException() {
        super();
    }
	
	public DateDifferenceException(String message) {
        super(message);
    }

}
