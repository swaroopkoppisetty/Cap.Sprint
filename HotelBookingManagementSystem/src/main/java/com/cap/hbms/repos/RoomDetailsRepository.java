package com.cap.hbms.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cap.hbms.entities.RoomDetails;


public class RoomDetailsRepository {
	
	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	

	
	//CRUD - Create, Read, Update, Delete
	//Named Queries - HQL
	
	public RoomDetails showRoomDetails(int room_id) {
		return em.find(RoomDetails.class, room_id);
	}
	
	public void addRoomDetails(RoomDetails rd) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(rd);
		tx.commit();
	}
	
	public void removeRoomDetails(int room_id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		RoomDetails rf = em.find(RoomDetails.class, room_id);
		em.remove(rf);
		tx.commit();
	}
	
	
	public void updateRoomDetails(int room_id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		RoomDetails rf = em.find(RoomDetails.class, room_id);
		rf.setRoom_no("106");
		tx.commit();
	}
	
	
	
	public List<RoomDetails> showAllRooms(){
		TypedQuery<RoomDetails> query = em.createQuery("select r from RoomDetails r ", RoomDetails.class);
		
		List<RoomDetails> hotels = query.getResultList();
		return hotels;
	}
	
	public static void main(String[] args) {
		
		RoomDetailsRepository repo = new RoomDetailsRepository();
		
		RoomDetails r = new RoomDetails(1,"105", "Suite", 1500.00, true);
		repo.addRoomDetails(r);
//		
//		

		
//	    RoomDetails foundRoomDetails = repo.showRoomDetails(1);
//		System.out.println(foundRoomDetails);
		
//		
//		List<RoomDetails> rooms = repo.showAllRoomDetails();
//		System.out.println(rooms);
//	
//		repo.removeRoomDetails(1);
		
//		repo.updateRoomDetails(1);
		

		
		
	}

}