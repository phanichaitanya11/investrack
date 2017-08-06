package com.investrack.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="investrack.bankacnt_details")
public class BankAcntDetailsEntity {

	@EmbeddedId
	private BankAcntDetailsPK bankAcntDetailsPK;
	
	@Column(name="account_num")
	private String accountNum;
	
	@Column(name="bank_name")
	private String bankName;
	
	@Column(name="primary_holder")
	private String primaryHolderName;
	
	@Column(name="secondary_holder")
	private String secondaryHolderName;
	
	@Column(name="ifsc_code")
	private String ifscCode;
	
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="jointacnt_flag")
	@Type(type="numeric_boolean")
	private boolean isJointAccount;

	/**
	 * @return the bankAcntDetailsPK
	 */
	public BankAcntDetailsPK getBankAcntDetailsPK() {
		return bankAcntDetailsPK;
	}

	/**
	 * @param bankAcntDetailsPK the bankAcntDetailsPK to set
	 */
	public void setBankAcntDetailsPK(BankAcntDetailsPK bankAcntDetailsPK) {
		this.bankAcntDetailsPK = bankAcntDetailsPK;
	}

	/**
	 * @return the accountNum
	 */
	public String getAccountNum() {
		return accountNum;
	}

	/**
	 * @param accountNum the accountNum to set
	 */
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
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
	 * @return the ifscCode
	 */
	public String getIfscCode() {
		return ifscCode;
	}

	/**
	 * @param ifscCode the ifscCode to set
	 */
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
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
	 * @return the isJointAccount
	 */
	public boolean isJointAccount() {
		return isJointAccount;
	}

	/**
	 * @param isJointAccount the isJointAccount to set
	 */
	public void setJointAccount(boolean isJointAccount) {
		this.isJointAccount = isJointAccount;
	}
}
