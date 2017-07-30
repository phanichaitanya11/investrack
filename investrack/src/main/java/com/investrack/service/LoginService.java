package com.investrack.service;

import com.investrack.beans.LoginBean;

public interface LoginService {

	boolean validateUser(LoginBean bean);

	boolean isActiveUser(LoginBean bean);

}