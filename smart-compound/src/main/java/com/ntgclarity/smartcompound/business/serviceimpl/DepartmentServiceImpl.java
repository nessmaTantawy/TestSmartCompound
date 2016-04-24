package com.ntgclarity.smartcompound.business.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntgclarity.smartcompound.business.service.DepartmentService;
import com.ntgclarity.smartcompound.common.entity.Department;
import com.ntgclarity.smartcompound.dataaccess.dao.DepartmentDAO;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDAO departmentDAO;
	@Override
	public List<Department> getAllDepartments() {
		
		return departmentDAO.getAllDepartments();
	}

	@Override
	public Department getDepartment(Long id) {
		
		if(id !=null)
		{
			return departmentDAO.getDepartment(id);
		}
		return null;
	}

	@Override
	public Department insertDepartment(Department department) {
		
		return departmentDAO.insertDepartment(department);
	}

	
	

}
