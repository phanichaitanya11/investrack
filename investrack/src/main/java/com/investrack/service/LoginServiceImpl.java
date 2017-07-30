package com.investrack.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.investrack.beans.LoginBean;
import com.investrack.dao.LoginDao;
import com.investrack.entity.UsersEntity;

@Service
public class LoginServiceImpl implements LoginService {

	private static final Logger log = Logger.getLogger(LoginServiceImpl.class);
	
	@Autowired
	private LoginDao loginDao;
	
	@Transactional
	public boolean validateUser(LoginBean bean) {
		boolean isValidUser = false;
		try {
			UsersEntity entity = prepareModel(bean);
			isValidUser = loginDao.validateUser(entity);
		} catch (SQLException sqle) {
			log.error("An SQL exception occurred while validating the user : " + bean.getUsername());
			sqle.printStackTrace();
		} catch (Exception e) {
			log.error("An exception occurred while validating the user : " + bean.getUsername());
			e.printStackTrace();
		}
		return isValidUser;
	}
	
	public boolean isActiveUser(LoginBean bean) {
		boolean isActiveUser = false;
		try {
			isActiveUser = loginDao.isActiveUser(bean.getUsername());
		} catch (SQLException sqle) {
			log.error("An SQL exception occurred while checking if user : " + bean.getUsername() + " is active or not");
			sqle.printStackTrace();
		} catch (Exception e) {
			log.error("An exception occurred while validating if user : " + bean.getUsername() + " is active or not");
			e.printStackTrace();
		}
		return isActiveUser;
	}
	
	private UsersEntity prepareModel(LoginBean bean) {
		UsersEntity e = new UsersEntity();
		if (bean != null) {
			e.setActive(bean.isActive());
			e.setPassword(bean.getPassword());
			e.setUsername(bean.getUsername());
		}
		return e;
	}
}
