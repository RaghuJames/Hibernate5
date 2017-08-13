package com.hib.dao;

import com.hib.model.Accounts;
import com.hib.model.User;

public interface UserDAO {

	void saveUser(User user);

	void saveAccounts(Accounts act);

}
