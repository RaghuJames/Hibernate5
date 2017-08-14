package com.hib.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hib.dao.UserDAO;
import com.hib.model.Accounts;
import com.hib.model.CommonModel;
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
		sessionFactory.getCurrentSession().save(act);
		act.getAccountList().forEach((l) ->{
			CommonModel m = new CommonModel();
			m.setBranchCode(act.getCommonModel().getBranchCode());
			m.setAuditDate(act.getCommonModel().getAuditDate());
			m.setModuleId(act.getCommonModel().getModuleId());
			l.setCommonModel(m);
			sessionFactory.getCurrentSession().save(l);
		});
		
		
		
	}

}
