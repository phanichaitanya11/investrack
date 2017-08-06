package com.investrack.beans;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserBean implements Serializable {

	private static final long serialVersionUID = 3161230243035129549L;

	private String userId;
	
	private String username;
	
	private List<String> bankAcntIds;

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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the bankAcntIds
	 */
	public List<String> getBankAcntIds() {
		return bankAcntIds;
	}

	/**
	 * @param bankAcntIds the bankAcntIds to set
	 */
	public void setBankAcntIds(List<String> bankAcntIds) {
		this.bankAcntIds = bankAcntIds;
	}
}
