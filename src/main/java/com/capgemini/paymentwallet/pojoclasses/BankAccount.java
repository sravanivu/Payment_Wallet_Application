package com.capgemini.paymentwallet.pojoclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "Bank_Account_Table")
public class BankAccount {
	@Id
	@Positive
	private int id;

	@Pattern(regexp = "^[A-Z]{4}[0-9]{7}$", message = "IFSC code must have 4 alphabets followed by 7 numbers total 11 characters")
	private String ifscCode;

	@Pattern(regexp = "^[A-Za-z ]{3,30}$", message = "enter valid bank name")

	private String bankName;

	@Min(value = 1000)
	private double balance;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "walletId", name = "WalletId")

	private Wallet wallet;

	public BankAccount() {
		super();
	}

	public BankAccount(int id, String ifscCode, String bankName, double balance, Wallet wallet) {
		super();
		this.id = id;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.balance = balance;
		this.wallet = wallet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "BankAccount [accountNo=" + id + ", ifscCode=" + ifscCode + ", bankName=" + bankName + ", balance="
				+ balance + ", wallet=" + wallet + "]";
	}

}
