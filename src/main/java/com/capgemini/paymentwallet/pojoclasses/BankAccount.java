package com.capgemini.paymentwallet.pojoclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

import javax.validation.constraints.Min;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;





@Entity
public class BankAccount {
	@Id
	//@GeneratedValue
	//@Digits(integer=5, fraction=0,message="Upto 5digits only")
	
	//@Range(min=1, max=1000,message="enter Account number between 1 and 1000 only")
	
	private int accountNo;
	
	@Pattern(regexp = "^[A-Z]{4}[0-9]{7}$",message = "IFSC code must have 4 alphabets followed by 7 numbers total 11 characters")
	private String ifscCode;
	
	
	@Pattern(regexp = "^[A-Za-z ]{3,30}$",message="enter valid bank name")
	@Size(max = 25, message = "Bank name should be less than 25 characters")
	private String bankName;
	

	@Min(value=1000)
	private double balance;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="walletId",name="WalletId")

	//@ManyToOne
	private Wallet wallet;
	public BankAccount() {
		super();
	}
	
	public BankAccount(int accountNo,
			@Pattern(regexp = "^[A-Z]{4}[0-9]{7}$", message = "IFSC code must have 4 alphabets followed by 7 numbers total 11 characters") String ifscCode,
			@Pattern(regexp = "^[A-Za-z ]{3,30}$", message = "enter valid bank name") @Size(max = 25, message = "Bank name should be less than 25 characters") String bankName,
			@Min(1000) double balance, Wallet wallet) {
		super();
		this.accountNo = accountNo;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.balance = balance;
		this.wallet = wallet;
	}

	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", ifscCode=" + ifscCode + ", bankName=" + bankName
				+ ", balance=" + balance + ", wallet=" + wallet + "]";
	}

}
