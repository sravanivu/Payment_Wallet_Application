package com.capgemini.paymentwallet.Exception;

public class InsufficientBalanceException extends RuntimeException{
private String message;
	
	public InsufficientBalanceException() {}

	
	public InsufficientBalanceException(String msg) {
		super(msg);
		this.message = msg;
	}
}
