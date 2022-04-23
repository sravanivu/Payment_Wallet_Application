package com.capgemini.paymentwallet.pojoclasses;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="wallet")
public class Wallet {
	@Id
	private int walletId;
	private BigDecimal walletbalance;
	public Wallet() {
		super();
	}
	public Wallet(int walletId, BigDecimal walletbalance) {
		super();
		this.walletId = walletId;
		this.walletbalance = walletbalance;
	}
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public BigDecimal getWalletbalance() {
		return walletbalance;
	}
	public void setBalance(BigDecimal balance) {
		this.walletbalance = walletbalance;
	}
	@Override
	public String toString() {
		return "Wallet [walletId=" + walletId + ", walletbalance=" + walletbalance + "]";
	}
	
	
}
