package org.zhouhy.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.zhouhy.springmvc.dao.BaseDao;
import java.lang.reflect.ParameterizedType;

public abstract class BaseDaoImpl<T> implements BaseDao<T> {

	
	@SuppressWarnings("unchecked")
	public Class<T> getTClass(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();		
		return (Class<T>) pt.getActualTypeArguments()[0];
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void add(T t) {
		getSession().save(t);		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		getSession().delete(getOneById(id));		
	}

	@Override
	public void update(T t) {
		getSession().update(t);		
	}

	@Override
	public T getOneById(Integer id) {		
		return getSession().load(getTClass(),id);
	}	
}
