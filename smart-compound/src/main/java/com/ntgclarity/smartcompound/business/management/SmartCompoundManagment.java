package com.ntgclarity.smartcompound.business.management;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ntgclarity.smartcompound.common.entity.Department;
import com.ntgclarity.smartcompound.common.entity.Employee;

@Service
public interface SmartCompoundManagment {

	List<Employee> getAllEmployees();

	List<Department> getAllDepartments();

	Employee getEmployee(Long id);

	Department getDepartment(Long id);

	Employee insertEmployee(Employee employee);

	Department insertDepartment(Department department);

	void updateEmployee(Employee employee);

}
