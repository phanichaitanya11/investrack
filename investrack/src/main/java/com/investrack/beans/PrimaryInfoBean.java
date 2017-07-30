package com.investrack.beans;

import java.io.Serializable;

public class PrimaryInfoBean implements Serializable {

	private static final long serialVersionUID = 7184325927030223572L;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String mobileNum;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the mobileNum
	 */
	public String getMobileNum() {
		return mobileNum;
	}

	/**
	 * @param mobileNum the mobileNum to set
	 */
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	@Override
	public String toString() {
		return "PrimaryInfoBean [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNum=" + mobileNum + "]";
	}
}
