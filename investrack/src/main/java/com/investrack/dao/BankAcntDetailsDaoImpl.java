package com.investrack.dao;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.investrack.beans.UserBean;
import com.investrack.entity.BankAcntDetailsEntity;

@Repository
public class BankAcntDetailsDaoImpl implements BankAcntDetailsDao {

	private static final Logger log = Logger.getLogger(BankAcntDetailsDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private UserBean userBean;

	public void addAccount(BankAcntDetailsEntity bankAcntEntity) throws SQLException {
		if (bankAcntEntity != null) {
			log.debug("Trying to add new bank account details for the user : " + bankAcntEntity.getBankAcntDetailsPK().getUserId());
			bankAcntEntity.getBankAcntDetailsPK().setUserId(userBean.getUserId());
			Session session = sessionFactory.getCurrentSession();
			session.save(bankAcntEntity);
			log.debug("New bank account added successfully for the user : " + bankAcntEntity.getBankAcntDetailsPK().getUserId());
		}
	}
}
