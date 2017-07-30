package com.investrack.beans;

import java.io.Serializable;

public class NomineeBean implements Serializable {

	private static final long serialVersionUID = -8484498742719927311L;

	private String name;
	
	private boolean isMinor;
	
	private String relationship;
	
	private float percentage;
	
	private String nameOfGaurdian;
	
	private String address;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isMinor
	 */
	public boolean isMinor() {
		return isMinor;
	}

	/**
	 * @param isMinor the isMinor to set
	 */
	public void setMinor(boolean isMinor) {
		this.isMinor = isMinor;
	}

	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}

	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	/**
	 * @return the percentage
	 */
	public float getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	/**
	 * @return the nameOfGaurdian
	 */
	public String getNameOfGaurdian() {
		return nameOfGaurdian;
	}

	/**
	 * @param nameOfGaurdian the nameOfGaurdian to set
	 */
	public void setNameOfGaurdian(String nameOfGaurdian) {
		this.nameOfGaurdian = nameOfGaurdian;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "NomineeBean [name=" + name + ", isMinor=" + isMinor + ", relationship=" + relationship + ", percentage="
				+ percentage + ", nameOfGaurdian=" + nameOfGaurdian + ", address=" + address + "]";
	}
}
