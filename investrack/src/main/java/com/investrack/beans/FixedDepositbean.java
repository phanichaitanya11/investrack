package com.investrack.beans;

import java.io.Serializable;
import java.util.Date;

public class FixedDepositbean implements Serializable {

	private static final long serialVersionUID = -8858771475609356414L;

	private PrimaryInfoBean primaryHolder;
	
	private BankBean bankDetails;
	
	private String depositAmount;
	
	private Date startDate;
	
	private Date maturityDate;
	
	private float rateOfInterest;
	
	private double maturityAmount;
	
	private int compoundedInterestFreq;
	
	private NomineeBean nominee;

	/**
	 * @return the primaryHolder
	 */
	public PrimaryInfoBean getPrimaryHolder() {
		return primaryHolder;
	}

	/**
	 * @param primaryHolder the primaryHolder to set
	 */
	public void setPrimaryHolder(PrimaryInfoBean primaryHolder) {
		this.primaryHolder = primaryHolder;
	}

	/**
	 * @return the bankDetails
	 */
	public BankBean getBankDetails() {
		return bankDetails;
	}

	/**
	 * @param bankDetails the bankDetails to set
	 */
	public void setBankDetails(BankBean bankDetails) {
		this.bankDetails = bankDetails;
	}

	/**
	 * @return the depositAmount
	 */
	public String getDepositAmount() {
		return depositAmount;
	}

	/**
	 * @param depositAmount the depositAmount to set
	 */
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the maturityDate
	 */
	public Date getMaturityDate() {
		return maturityDate;
	}

	/**
	 * @param maturityDate the maturityDate to set
	 */
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	/**
	 * @return the rateOfInterest
	 */
	public float getRateOfInterest() {
		return rateOfInterest;
	}

	/**
	 * @param rateOfInterest the rateOfInterest to set
	 */
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	/**
	 * @return the maturityAmount
	 */
	public double getMaturityAmount() {
		return maturityAmount;
	}

	/**
	 * @param maturityAmount the maturityAmount to set
	 */
	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	/**
	 * @return the compoundedInterestFreq
	 */
	public int getCompoundedInterestFreq() {
		return compoundedInterestFreq;
	}

	/**
	 * @param compoundedInterestFreq the compoundedInterestFreq to set
	 */
	public void setCompoundedInterestFreq(int compoundedInterestFreq) {
		this.compoundedInterestFreq = compoundedInterestFreq;
	}

	/**
	 * @return the nominee
	 */
	public NomineeBean getNominee() {
		return nominee;
	}

	/**
	 * @param nominee the nominee to set
	 */
	public void setNominee(NomineeBean nominee) {
		this.nominee = nominee;
	}

	@Override
	public String toString() {
		return "FixedDepositbean [primaryHolder=" + primaryHolder + ", bankDetails=" + bankDetails + ", depositAmount="
				+ depositAmount + ", startDate=" + startDate + ", maturityDate=" + maturityDate + ", rateOfInterest="
				+ rateOfInterest + ", maturityAmount=" + maturityAmount + ", compoundedInterestFreq="
				+ compoundedInterestFreq + ", nominee=" + nominee + "]";
	}
}
