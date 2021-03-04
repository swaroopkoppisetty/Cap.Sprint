package com.cg.hbms.springboot.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbms.springboot.entities.BookingDetails;

@Repository


	
	public interface IBookingDetailsRepository extends JpaRepository<BookingDetails, Integer>{

		public BookingDetails findByBookingId(int bookingId);
		public BookingDetails findByUserId(int UserId);
		public BookingDetails findByNoOfAdults(int noOfAdults);
		
		//public BookingDetails findAllBookingDetails(String bookingdetails);
	}


