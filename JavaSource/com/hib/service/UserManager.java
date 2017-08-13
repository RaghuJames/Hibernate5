package com.hib.service;

import com.hib.model.Accounts;
import com.hib.model.User;

public interface UserManager {

	void saveUser(User user);

	void saveAccounts(Accounts act);

}
