package org.zhouhy.springmvc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.zhouhy.springmvc.dao.UserDao;
import org.zhouhy.springmvc.model.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		String hql = " from User";		
		return getSession().createQuery(hql).list();		
	}
}
