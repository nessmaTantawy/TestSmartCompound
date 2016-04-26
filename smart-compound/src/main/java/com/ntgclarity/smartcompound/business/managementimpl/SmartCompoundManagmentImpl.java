package com.ntgclarity.smartcompound.business.managementimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntgclarity.smartcompound.business.management.SmartCompoundManagment;
import com.ntgclarity.smartcompound.business.service.DepartmentService;
import com.ntgclarity.smartcompound.business.service.EmployeeService;
import com.ntgclarity.smartcompound.common.entity.Department;
import com.ntgclarity.smartcompound.common.entity.Employee;

@Service
public class SmartCompoundManagmentImpl implements SmartCompoundManagment {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private DepartmentService departmentService;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@Override
	public Employee getEmployee(Long id) {
		return employeeService.getEmployee(id);
	}

	/**
	 * methodCreater:nessma create Employee this metohd will call
	 * employeeService.insertEmployee
	 **/
	@Override
	public Employee insertEmployee(Employee employee) {

		return employeeService.insertEmployee(employee);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@Override
	public Department getDepartment(Long id) {
		return departmentService.getDepartment(id);
	}

	@Override
	public Department insertDepartment(Department department) {

		return departmentService.insertDepartment(department);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeService.updateEmployee(employee);

	}

}
