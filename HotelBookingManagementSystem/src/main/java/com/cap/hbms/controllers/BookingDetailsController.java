package com.cg.hbms.springboot.controller;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbms.springboot.exceptions.BookingDetailsException;
import com.cg.hbms.springboot.entities.BookingDetails;
import com.cg.hbms.springboot.repo.IBookingDetailsRepository;


@RestController

public class BookingDetailsController {	
	
		
		@Autowired
		IBookingDetailsRepository bookingdetailsRepository;
		
		// Add BookingDetails
		@PostMapping("/bookingdetails")
		@ResponseStatus(code = HttpStatus.CREATED)
		public void addUser(@RequestBody  BookingDetails b) {
			
			BookingDetails bookingdetails = bookingdetailsRepository.findByBookingId(b.getBookingId() );
			if(bookingdetails==null)
				bookingdetailsRepository.save(b);
			else throw new BookingDetailsException("Booking Details entered" + b.getBookingId()  + "already exists");
		}

//		// Update BookingDetails
//		
//		@RequestMapping(value="/bookingdetails/{userId}" , method = RequestMethod.PUT)
//		@Transactional
//		public ResponseEntity<Void> updateBookingDetails(@RequestBody BookingDetails b, @PathVariable("userId")int userId) {
//			ResponseEntity<Void>  re;
//			
//			BookingDetails bd1 = bookingdetailsRepository.findByUserId(b.getUserId());
//			bd1.setUserId(b.getUserId());
//			re = new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//			return re;
//		}
		
		
//		@RequestMapping(value="/bookingdetails" , method = RequestMethod.PUT)
//		@Transactional
//		public ResponseEntity<Void> updateBookingDetails(@RequestBody BookingDetails b) {
//			ResponseEntity<Void>  re;
//			
//			BookingDetails bd1 = bookingdetailsRepository.findByNoOfAdults(b.getNoOfAdults());
//			bd1.setNoOfAdults(b.getNoOfAdults());
//			re = new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//			return re;
//		}
		@RequestMapping(value="/bookingdetails" , method = RequestMethod.PUT)
		@Transactional
		public ResponseEntity<Void> updateBookingDetails(@RequestBody BookingDetails b) {
			ResponseEntity<Void>  re;
			
			BookingDetails bd1 = bookingdetailsRepository.findByBookingId(b.getBookingId());
			bd1.setNoOfAdults(b.getNoOfAdults());
			re = new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			return re;
		}
		// Remove BookingDetails
		
		@DeleteMapping("/bookingdetails/{booking_id}")
		public void deleteBookingDetails(@PathVariable("booking_id") int booking_id) {
			Optional <BookingDetails> bookingdetails= bookingdetailsRepository.findById(booking_id);
			BookingDetails b= null;
			if(bookingdetails.isPresent()) {
				b = bookingdetails.get();
				bookingdetailsRepository.delete(b);
			}
			}
			
			
		
		// Show all BookingDetails
		
		@GetMapping("/bookingdetails")
		public List<BookingDetails> findAllBookingDetails(){
			System.out.println("Method mapped to Http....");
			return bookingdetailsRepository.findAll();
		}
		
		//Show BookingDetails
		
		@GetMapping("/bookingdetails/{bookingId}")
		public ResponseEntity<BookingDetails> findbookingdetails(@PathVariable("bookingId") int bookingId) {
			
			ResponseEntity<BookingDetails> re = null;
			
			Optional <BookingDetails> bookingdetails = bookingdetailsRepository.findById(bookingId);
			BookingDetails b = null;
			if(bookingdetails.isPresent()) {
				b = bookingdetails.get();
				re = new ResponseEntity<>(b, HttpStatus.OK);
			}
			else {
				re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			return re;
		}

}
