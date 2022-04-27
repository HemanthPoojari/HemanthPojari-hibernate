package com.xworkz.jpa;

public class RestaurantJPADAO {

	public void saveRestaurentJPA(RestaurantEntity entity) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("jpa");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		entitymanager.persist(entity);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}

}