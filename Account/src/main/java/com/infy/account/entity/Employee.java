package com.infy.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_INFO")
public class Employee {
	@Id
	@Column(name = "EMP_ID")
	private Integer EMP_ID;

	@Column(name = "EMP_NAME")
	private String empName;

	private Integer salary;

	public Integer getEmpId() {
		return EMP_ID;
	}

	public void setEmpId(Integer EMP_ID) {
		this.EMP_ID = EMP_ID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
	}

}