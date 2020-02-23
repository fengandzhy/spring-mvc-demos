package org.zhouhy.springmvc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.zhouhy.springmvc.dao.DepartmentDao;
import org.zhouhy.springmvc.model.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getAll() {
		String hql = " from Department";		
		return getSession().createQuery(hql).list();		
	}

}
