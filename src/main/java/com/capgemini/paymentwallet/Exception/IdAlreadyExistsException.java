package com.capgemini.paymentwallet.Exception;

public class IdAlreadyExistsException extends RuntimeException {
private String message;
	
	public IdAlreadyExistsException() {}

	public IdAlreadyExistsException(String msg) {
		super(msg);
		this.message = msg;
	}

}
