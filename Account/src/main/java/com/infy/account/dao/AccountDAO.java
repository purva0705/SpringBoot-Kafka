package com.infy.account.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.infy.account.entity.Employee;

public class AccountDAO {

	@Autowired
	private SessionFactory sessionfactory;
	Session session = null;

	public Employee getEmployeeById(int id) {
		session = sessionfactory.openSession();
		session.beginTransaction();
		Employee employee = session.get(Employee.class, id);

		session.getTransaction().commit();
		session.close();
		return employee;
	}
}
