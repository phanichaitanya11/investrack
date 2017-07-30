package com.investrack.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountsDaoImpl {

	private static final Logger log = Logger.getLogger(BankAccountsDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public static void addAccount() {
		
	}
}
