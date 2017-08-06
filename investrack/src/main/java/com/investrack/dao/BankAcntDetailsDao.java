package com.investrack.dao;

import java.sql.SQLException;

import com.investrack.entity.BankAcntDetailsEntity;

public interface BankAcntDetailsDao {

	public void addAccount(BankAcntDetailsEntity bankAcntEntity) throws SQLException;

}