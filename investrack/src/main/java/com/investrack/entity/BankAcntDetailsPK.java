package com.investrack.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class BankAcntDetailsPK implements Serializable {

	private static final long serialVersionUID = 1477196387777765357L;

	@Column(name="bankacnt_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String bankAcntId;
	
	@Column(name="userid")
	private String userId;

	public BankAcntDetailsPK() {}
	
	public BankAcntDetailsPK(String bankAcntId, String userId) {
		this.bankAcntId = bankAcntId;
		this.userId = userId;
	}

	/**
	 * @return the bankAcntId
	 */
	public String getBankAcntId() {
		return bankAcntId;
	}

	/**
	 * @param bankAcntId the bankAcntId to set
	 */
	public void setBankAcntId(String bankAcntId) {
		this.bankAcntId = bankAcntId;
	}

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

	@Override
	public String toString() {
		return "BankAcntDetailsPK [bankAcntId=" + bankAcntId + ", userId=" + userId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankAcntId == null) ? 0 : bankAcntId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAcntDetailsPK other = (BankAcntDetailsPK) obj;
		if (bankAcntId == null) {
			if (other.bankAcntId != null)
				return false;
		} else if (!bankAcntId.equals(other.bankAcntId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
}