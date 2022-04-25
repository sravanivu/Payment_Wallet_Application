package com.capgemini.paymentwallet.Exception;

public class WalletNotFoundException extends RuntimeException{
	
	public WalletNotFoundException(String msg) {
		super(msg);
	}

}
