package com.cap.hbms.repos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.hbms.entities.Payments;


public class PaymentsRepository 
{
EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	
	EntityManager em = emf.createEntityManager();
	
	public void addPayment(Payments payments)
	{
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(payments);
		tx.commit();
		
	}
}
