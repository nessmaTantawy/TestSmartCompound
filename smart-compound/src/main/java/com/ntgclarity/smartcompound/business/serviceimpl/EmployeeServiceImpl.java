package com.ntgclarity.smartcompound.business.serviceimpl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntgclarity.smartcompound.business.service.EmployeeService;
import com.ntgclarity.smartcompound.common.entity.Employee;
import com.ntgclarity.smartcompound.dataaccess.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public Employee getEmployee(Long id) {
		if(id !=null)
		{
			return employeeDAO.getEmployee(id);
		}
		return null;
	}
	/**
	 *methodCreater:nessma 
	 *create Employee 
	 *this metohd will call employeeDAO.insertEmployee
	 
	  **/
	@Override
	public Employee insertEmployee(Employee employee) {
		
		return employeeDAO.insertEmployee(employee);
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee);
		
	}


}
