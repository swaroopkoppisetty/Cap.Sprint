package com.cap.hbms.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cap.hbms.entities.Hotel;


public class HotelRepository {
	
	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	

	
	//CRUD - Create, Read, Update, Delete
	//Named Queries - HQL
	
	public Hotel showHotel(int hotel_id) {
		return em.find(Hotel.class, hotel_id);
	}
	
	public void addHotel(Hotel h) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(h);
		tx.commit();
	}
	
	public void removeHotel(int hotel_id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Hotel hf = em.find(Hotel.class, hotel_id);
		em.remove(hf);
		tx.commit();
	}
	
	
	public void updateHotel(int hotel_id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Hotel hf = em.find(Hotel.class, hotel_id);
		hf.setHotel_name("Shangrila Hotel");
		tx.commit();
	}
	
	
	
	public List<Hotel> showAllHotels(){
		TypedQuery<Hotel> query = em.createQuery("select h from Hotel h ", Hotel.class);
		
		List<Hotel> hotels = query.getResultList();
		return hotels;
	}
	
	public static void main(String[] args) {
		
		HotelRepository repo = new HotelRepository();
		
//		Hotel h = new Hotel("Shanthi Vilas Hotel", "5 star hotel, multiple cousine", "Sahakarnagar Road", "Bangalore", "1234564890", "0989654322","hotelVilas@abc.com","hotelVilas.com", 15.0);
//		repo.addHotel(h);
//		
//		Hotel h = new Hotel("Anand Hotel", "5 star hotel, indoor spa, multiple cousine", "Magadi Road", "Bangalore", "1234567970", "0986654322","hotelAnand@abc.com","hotelAnand.com", 18.0);
//		repo.addHotel(h);

		
//	    Hotel foundHotel = repo.showHotel(1);
//		System.out.println(foundHotel);
		
//		
//		List<Hotel> hotels = repo.showAllHotels();
//		System.out.println(hotels);
//	
//		repo.removeHotel(1);
		
		repo.updateHotel(2);
		

		
		
	}

}

   