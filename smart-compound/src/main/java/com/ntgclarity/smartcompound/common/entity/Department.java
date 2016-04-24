package com.ntgclarity.smartcompound.common.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import com.ntgclarity.smartcompound.common.base.BaseEntity;

/**
 * 
 * @author nessma
 */
@Entity
@Table(name = "DEPARTMENT")
public class Department extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_SEQ_GEN")
//	@SequenceGenerator(name = "EMPLOYEE_SEQ_GEN", sequenceName = "EMPLOYEE_SEQ")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	 @GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "department_name", nullable = false)
	private String departmentName;
	@OneToMany(mappedBy = "deptId", fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
	private List<Employee> employeeList;

	public Department() {
	}

	public Department(Long id) {
		this.id = id;
	}

	public Department(Long id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@XmlTransient
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName
				+ ", employeeList=" + employeeList + "]";
	}

}
