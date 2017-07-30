package com.investrack.beans;

import java.io.Serializable;

public class BankBean implements Serializable {

	private static final long serialVersionUID = 482334032017535317L;

	private String bankName;
	
	private String accountNumber;
	
	private String branchName;
	
	private String IfscCode;
	
	private String bankAddress;

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the ifscCode
	 */
	public String getIfscCode() {
		return IfscCode;
	}

	/**
	 * @param ifscCode the ifscCode to set
	 */
	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}

	/**
	 * @return the bankAddress
	 */
	public String getBankAddress() {
		return bankAddress;
	}

	/**
	 * @param bankAddress the bankAddress to set
	 */
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	@Override
	public String toString() {
		return "BankBean [bankName=" + bankName + ", accountNumber=" + accountNumber + ", branchName=" + branchName
				+ ", IfscCode=" + IfscCode + ", bankAddress=" + bankAddress + "]";
	}
}
