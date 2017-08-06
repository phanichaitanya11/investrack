package com.investrack.beans;

import java.io.Serializable;

public class BankBean implements Serializable {

	private static final long serialVersionUID = 482334032017535317L;

	private String userId;
	
	private String bankacntId;
	
	private String bankName;
	
	private String accountNumber;
	
	private String branchName;
	
	private String IfscCode;
	
	private String primaryHolderName;
	
	private String secondaryHolderName;
	
	private boolean isJointAcnt;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the bankacntId
	 */
	public String getBankacntId() {
		return bankacntId;
	}

	/**
	 * @param bankacntId the bankacntId to set
	 */
	public void setBankacntId(String bankacntId) {
		this.bankacntId = bankacntId;
	}

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
	 * @return the primaryHolderName
	 */
	public String getPrimaryHolderName() {
		return primaryHolderName;
	}

	/**
	 * @param primaryHolderName the primaryHolderName to set
	 */
	public void setPrimaryHolderName(String primaryHolderName) {
		this.primaryHolderName = primaryHolderName;
	}

	/**
	 * @return the secondaryHolderName
	 */
	public String getSecondaryHolderName() {
		return secondaryHolderName;
	}

	/**
	 * @param secondaryHolderName the secondaryHolderName to set
	 */
	public void setSecondaryHolderName(String secondaryHolderName) {
		this.secondaryHolderName = secondaryHolderName;
	}

	/**
	 * @return the isJointAcnt
	 */
	public boolean isJointAcnt() {
		return isJointAcnt;
	}

	/**
	 * @param isJointAcnt the isJointAcnt to set
	 */
	public void setJointAcnt(boolean isJointAcnt) {
		this.isJointAcnt = isJointAcnt;
	}

	@Override
	public String toString() {
		return "BankBean [userId=" + userId + ", bankacntId=" + bankacntId + ", bankName=" + bankName
				+ ", accountNumber=" + accountNumber + ", branchName=" + branchName + ", IfscCode=" + IfscCode
				+ ", primaryHolderName=" + primaryHolderName + ", secondaryHolderName=" + secondaryHolderName
				+ ", isJointAcnt=" + isJointAcnt + "]";
	}
}
