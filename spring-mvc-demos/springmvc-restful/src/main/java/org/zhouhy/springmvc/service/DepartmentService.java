package org.zhouhy.springmvc.service;

import java.util.List;
import org.zhouhy.springmvc.model.Department;

public interface DepartmentService extends BaseService<Department>{
	
	public List<Department> getAll();
}
