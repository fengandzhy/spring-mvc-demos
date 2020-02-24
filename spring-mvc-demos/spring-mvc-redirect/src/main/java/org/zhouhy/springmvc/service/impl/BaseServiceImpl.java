package org.zhouhy.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.zhouhy.springmvc.dao.BaseDao;
import org.zhouhy.springmvc.service.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	protected BaseDao<T> baseDao;
	
	@Override
	public void add(T t) {
		baseDao.add(t);		
	}

	@Override
	public void update(T t) {
		baseDao.update(t);		
	}

	@Override
	public void delete(Integer id) {
		baseDao.delete(id);		
	}

	@Override
	public T getOneById(Integer id) {
		// TODO Auto-generated method stub
		return baseDao.getOneById(id);
	}
}
