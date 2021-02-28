package com.cap.hbms.repos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.cap.hbms.entities.Transactions;

public class TransactionsRepository 
{
EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	
	EntityManager em = emf.createEntityManager();
	
	public void addTransaction(Transactions transactions)
	{
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(transactions);
		tx.commit();
		
	}
}
