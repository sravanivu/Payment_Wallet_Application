package com.capgemini.paymentwallet.Exception;

public class InvalidUserInputException extends RuntimeException {

	public InvalidUserInputException(String msg) {
		super(msg);
	}
}