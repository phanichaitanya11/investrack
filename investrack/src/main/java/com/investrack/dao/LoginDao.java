package com.investrack.dao;

import java.sql.SQLException;

import com.investrack.entity.UsersEntity;

public interface LoginDao {

	boolean validateUser(UsersEntity userEnty) throws SQLException;

	boolean isActiveUser(String username) throws SQLException;

}