package com.capgemini.paymentwallet.Exception;

public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
