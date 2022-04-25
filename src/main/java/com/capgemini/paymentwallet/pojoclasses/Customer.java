package com.capgemini.paymentwallet.pojoclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Customer {
	
	@Id
	@NotBlank
	@Pattern(regexp="^[0-9]{6}$",message="enter valid customer ID")
	private int cId;
	
	@NotBlank
	@NotNull
	@Pattern(regexp="^[a-zA-Z]*$",message="enter your valid customer name")
	private String cName;
	
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$",message = "Enter valid Mobile number ")
	@NotBlank
	private String mobile;
	
	@NotBlank
	@Pattern(regexp="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[$@#*\\\\/&!�?�+%()=-])(.{8,})",message="give valid password ")
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="walletId",name="WalletId")

	//@ManyToOne
	private Wallet wallet;
	public Customer() {
		super();
	}
	public Customer(int cId, String cName, String mobile, String password, Wallet wallet) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.mobile = mobile;
		this.password = password;
		this.wallet = wallet;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
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
		return "Customer [cId=" + cId + ", cName=" + cName + ", mobile=" + mobile + ", password=" + password
				+ ", wallet=" + wallet + "]";
	}
	
}
