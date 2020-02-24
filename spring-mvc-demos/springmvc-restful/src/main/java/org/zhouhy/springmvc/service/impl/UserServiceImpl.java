package org.zhouhy.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhouhy.springmvc.dao.UserDao;
import org.zhouhy.springmvc.model.User;
import org.zhouhy.springmvc.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAll() {		
		return userDao.getAll();
	}
	
	
}
