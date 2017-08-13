package com.hib.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hib.dao.UserDAO;
import com.hib.model.Accounts;
import com.hib.model.User;

@Transactional
@Repository
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void saveUser(User user) {
		System.out.println("======="+user.getUserId()+"==="+user.getUserName());
		sessionFactory.getCurrentSession().save(user);
		
	}
	@Override
	public void saveAccounts(Accounts act) {
		System.out.println("==="+act.getCommonModel().getBranchCode()+"=="+act.getCommonModel().getAuditDate()+"==="+act.getCommonModel().getModuleId()+"=="+act.getAcctCode());
		sessionFactory.getCurrentSession().save(act);
		
	}

}
