package com.xworkz.dao;

import javax.security.auth.login.Configuration;

import com.xworkz.entity.RestaurantEntity;

public class RestaurantDAO {

public void saveRestaurant(RestaurantEntity entity) {
		
		Configuration configuration = new Configuration(); // 
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();//which makes physical connection & session makes to perform the CRUD.
		
		// In hibernate autoCommit is false.
		Transaction transaction = session.beginTransaction();
		
		session.persist(entity);
		
		transaction.commit();//it will save the data in the table.
	}

}
