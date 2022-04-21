package com.capgemini.paymentwallet.pojoclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	private String cName;
	private String mobile;
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="walletId",name="WalletId")

	private Wallet wallet;
	public Customer() {
		super();
	}
	public Customer(String cName, String mobile, String password, Wallet wallet) {
		super();
		this.cName = cName;
		this.mobile = mobile;
		this.password = password;
		this.wallet = wallet;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "Customer [cName=" + cName + ", mobile=" + mobile + ", password=" + password + ", wallet=" + wallet
				+ "]";
	}
	

}
