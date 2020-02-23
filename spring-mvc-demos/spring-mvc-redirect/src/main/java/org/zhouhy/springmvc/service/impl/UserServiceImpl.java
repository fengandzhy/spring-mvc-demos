package org.zhouhy.springmvc.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zhouhy.springmvc.model.User;
import org.zhouhy.springmvc.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
