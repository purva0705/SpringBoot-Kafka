package com.infy.kafka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infy.entity.AllData;

@Repository
public class AllDataDAO {
	@Autowired
	private SessionFactory sessionfactory;
	Session session = null;

	public void saveAllDetails(int id, String name, String dept) {
		session = sessionfactory.openSession();
		session.beginTransaction();
		AllData allData = new AllData();
		allData.setId(id);
		allData.setName(name);
		allData.setDept(dept);
		session.save(allData);

		session.getTransaction().commit();
		session.close();
	}

}
