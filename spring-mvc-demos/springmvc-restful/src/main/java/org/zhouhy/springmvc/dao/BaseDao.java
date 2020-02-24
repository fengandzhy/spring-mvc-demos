package org.zhouhy.springmvc.dao;

import java.util.List;

public interface BaseDao<T> {
	
	public void add(T t);
	
	public void delete(int id);
	
	public void update(T t);
	
	public T getOneById(Integer id);
	
	public List<T> getAll();
}
