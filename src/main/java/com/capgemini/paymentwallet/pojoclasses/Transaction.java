package com.capgemini.paymentwallet.pojoclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Transaction {
	@Id
	private int transactionId;
	private String transactionType;
	private String transactionDate;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="walletId",name="WalletId")
	public Wallet wallet;
	private double amount;
	public Transaction() {
		super();
	}
	public Transaction(int transactionId, String transactionType, String transactionDate, Wallet wallet,
			double amount) {
		super();
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.wallet = wallet;
		this.amount = amount;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionType=" + transactionType
				+ ", transactionDate=" + transactionDate + ", wallet=" + wallet + ", amount=" + amount + "]";
	}
	

}
