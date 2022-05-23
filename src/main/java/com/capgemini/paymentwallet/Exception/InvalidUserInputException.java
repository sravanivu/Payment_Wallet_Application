package com.capgemini.paymentwallet.Exception;

public class InvalidUserInputException extends RuntimeException {
	private String message;
	
	public InvalidUserInputException() {}

	public InvalidUserInputException(String msg) {
		super(msg);
		this.message = msg;
	}
}
