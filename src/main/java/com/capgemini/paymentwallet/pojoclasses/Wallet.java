package com.capgemini.paymentwallet.pojoclasses;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;

@Entity
@Table(name = "wallet")
public class Wallet {

	@Id
	private int walletId;

	@DecimalMin(value = "1.0", message = "Balance must be atleast 1.0")
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
