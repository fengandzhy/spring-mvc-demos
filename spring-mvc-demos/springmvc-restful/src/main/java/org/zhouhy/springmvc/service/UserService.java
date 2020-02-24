package org.zhouhy.springmvc.service;

import java.util.List;

import org.zhouhy.springmvc.model.User;

public interface UserService extends BaseService<User>{
	
	public List<User> getAll();
}
