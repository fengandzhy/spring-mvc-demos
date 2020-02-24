package org.zhouhy.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhouhy.springmvc.dao.DepartmentDao;
import org.zhouhy.springmvc.model.Department;
import org.zhouhy.springmvc.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public List<Department> getAll() {		
		return departmentDao.getAll();
	}

}
