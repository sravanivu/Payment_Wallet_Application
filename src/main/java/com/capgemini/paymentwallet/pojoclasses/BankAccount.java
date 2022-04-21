package com.capgemini.paymentwallet.pojoclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BankAccount {
	@Id
	//@GeneratedValue
	private int accountNo;
	private String ifscCode;
	private String bankName;
	private double balance;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="walletId",name="WalletId")

	private Wallet wallet;
	public BankAccount() {
		super();
	}
	public BankAccount(int accountNo, String ifscCode, String bankName, double balance, Wallet wallet) {
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
