package com.capgemini.paymentwallet.pojoclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

@Entity
public class BenificiaryDetails {

	@Id
	private int benificiaryId;

	@Pattern(regexp = "^[A-Za-z _.]{3,25}$", message = "Name should be in the range of 3 to 25 characters")
	private String name;
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Enter valid Mobile Number")
	private String mobileNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "walletId", name = "WalletId")

	private Wallet wallet;

	public BenificiaryDetails() {
		super();
	}

	public BenificiaryDetails(int benificiaryId, String name, String mobileNumber, Wallet wallet) {
		super();
		this.benificiaryId = benificiaryId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.wallet = wallet;
	}

	public int getBenificiaryId() {
		return benificiaryId;
	}

	public void setBenificiaryId(int benificiaryId) {
		this.benificiaryId = benificiaryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "BenificiaryDetails [benificiaryId=" + benificiaryId + ", name=" + name + ", mobileNumber="
				+ mobileNumber + ", wallet=" + wallet + "]";
	}

}
