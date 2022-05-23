package com.capgemini.paymentwallet.Exception;

public class NotFoundException extends RuntimeException {
private String message;
	
	public NotFoundException() {}

	public NotFoundException(String msg) {
		super(msg);
		this.message = msg;
	}


}
