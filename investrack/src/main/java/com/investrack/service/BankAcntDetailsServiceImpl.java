package com.investrack.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.investrack.beans.BankBean;
import com.investrack.dao.BankAcntDetailsDao;
import com.investrack.entity.BankAcntDetailsEntity;
import com.investrack.entity.BankAcntDetailsPK;

@Service
public class BankAcntDetailsServiceImpl implements BankAcntDetailsService {

	private static final Logger log = Logger.getLogger(BankAcntDetailsServiceImpl.class);
	
	@Autowired
	private BankAcntDetailsDao bankAcntDetailsDao;

	@Transactional
	public boolean addAccount(BankBean bankBean) {
		boolean isAccountAdded = false;
		if (bankBean != null) {
			try {
				bankAcntDetailsDao.addAccount(prepareBankAcntEntityFromBean(bankBean));
				isAccountAdded = true;
			} catch (SQLException sqle) {
				log.error("An sql exception has occurred while adding new bank account details for user : " + bankBean.getUserId());
				sqle.printStackTrace();
				isAccountAdded = false;
			} catch (Exception e) {
				log.error("An exception has occurred while adding new bank account details for user : " + bankBean.getUserId());
				e.printStackTrace();
				isAccountAdded = false;
			}
		}
		return isAccountAdded;
	}
	
	private BankAcntDetailsEntity prepareBankAcntEntityFromBean(BankBean bean) {
		BankAcntDetailsEntity entity = new BankAcntDetailsEntity();
		BankAcntDetailsPK entityPk = new BankAcntDetailsPK();
		if (bean != null) {
			entity.setAccountNum(bean.getAccountNumber());
			entity.setBankName(bean.getBankName());
			entity.setBranchName(bean.getBranchName());
			entity.setIfscCode(bean.getIfscCode());
			entity.setJointAccount(bean.isJointAcnt());
			entity.setPrimaryHolderName(bean.getPrimaryHolderName());
			entity.setSecondaryHolderName(bean.getSecondaryHolderName());
			entityPk.setBankAcntId(bean.getBankacntId());
			entityPk.setUserId(bean.getUserId());
			entity.setBankAcntDetailsPK(entityPk);
		}
		return entity;
	}
}
