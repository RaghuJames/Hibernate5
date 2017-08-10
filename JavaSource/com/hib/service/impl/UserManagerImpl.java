package com.hib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hib.dao.UserDAO;
import com.hib.model.User;
import com.hib.service.UserManager;

@Service
public class UserManagerImpl implements UserManager {

	private UserDAO userDAO;
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void saveUser(User user) {
		this.userDAO.saveUser(user);
		
	}

}
