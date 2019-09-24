package com.infy.account.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.account.dao.AccountDAO;
import com.infy.account.entity.Employee;

public class AccountService {

	@Autowired
	AccountDAO accountDao;

	public Employee getEmpDetails(Integer empId) {

		Employee employee = new Employee();
		employee = accountDao.getEmployeeById(empId);

		if (employee.equals(null)) {

			employee.setEmpId(0705);
			employee.setEmpName("PURVA");
			employee.setSalary(10000);
		} else {
			employee.setEmpId(employee.getEmpId());
			employee.setEmpName(employee.getEmpName());
			employee.setSalary(employee.getSalary());

		}
		return employee;

	}
}
