package com.investrack.dao;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.investrack.beans.UserBean;
import com.investrack.entity.UsersEntity;

@Repository
public class LoginDaoImpl implements LoginDao {

	private static final Logger log = Logger.getLogger(LoginDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private UserBean userBean;
	
	public boolean validateUser(UsersEntity userEnty) throws Exception {
		boolean isValidUser = false;
		if (userEnty != null) {
			log.debug("Trying to validate the user");
			Session session = sessionFactory.getCurrentSession();
			UsersEntity user = (UsersEntity) session.get(UsersEntity.class, userEnty.getUsername());
			if (user != null && userEnty.getPassword().equals(user.getPassword()) && user.isActive()) {
				isValidUser = true;
				setupUserBean(user);
			}
			log.debug("user validated successfully");
		}
		return isValidUser;
	}
	
	public boolean isActiveUser(String username) throws SQLException {
		boolean isActiveUser = false;
		if (username != null) {
			log.debug("Trying to check whether user is active or not");
			Session session = sessionFactory.getCurrentSession();
			UsersEntity user = (UsersEntity) session.get(UsersEntity.class, username);
			if (user != null && user.isActive()) {
				isActiveUser = true;
			}
			log.debug("User active status checked successfully");
		}
		return isActiveUser;
	}
	
	private void setupUserBean(UsersEntity user) throws Exception {
		if (user != null) {
			userBean.setUserId(user.getUserId());
			userBean.setUsername(user.getPassword());
		}
	}
}
