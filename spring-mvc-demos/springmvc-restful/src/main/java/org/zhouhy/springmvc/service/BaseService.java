package org.zhouhy.springmvc.service;

public interface BaseService<T> {
	
	public void add(T t);
	
	public void update(T t);
	
	public void delete(Integer id);
	
	public T getOneById(Integer id);
}