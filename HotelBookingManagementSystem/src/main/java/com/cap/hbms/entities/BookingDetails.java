package com.cg.hbms.springboot.entities;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@Entity

public class BookingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//entities
//	@OneToMany(cascade = CascadeType.PERSIST)
//	Payments payments;
	int bookingId;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	Hotel hotel;
	int hotelId;
//	@OneToMany(cascade = CascadeType.PERSIST)
//	RoomDetails roomdetails;
	int roomId;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	User user;
	int userId;
	LocalDateTime bookedFrom;
	LocalDateTime bookedTo;
	int noOfAdults;
	int noOfChildren;
	double amount;
	//no argument constructor
	public BookingDetails() {
		
	}
    //constructor with all arguments

	public BookingDetails(int bookingId, int hotelId, int roomId, int userId, LocalDateTime bookedFrom,
			LocalDateTime bookedTo, int noOfAdults, int noOfChildren, double amount) {
		super();
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.roomId = roomId;
		this.userId = userId;
		this.bookedFrom = bookedFrom;
		this.bookedTo = bookedTo;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.amount = amount;
	}
	
	
	//Getters and Setters	

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDateTime getBookedFrom() {
		return bookedFrom;
	}

	public void setBookedFrom(LocalDateTime bookedFrom) {
		this.bookedFrom = bookedFrom;
	}

	public LocalDateTime getBookedTo() {
		return bookedTo;
	}

	public void setBookedTo(LocalDateTime bookedTo) {
		this.bookedTo = bookedTo;
	}

	public int getNoOfAdults() {
		return noOfAdults;
	}

	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	//ToString method
	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", hotelId=" + hotelId + ", roomId=" + roomId + ", userId="
				+ userId + ", bookedFrom=" + bookedFrom + ", bookedTo=" + bookedTo + ", noOfAdults=" + noOfAdults
				+ ", noOfChildren=" + noOfChildren + ", amount=" + amount + "]";
	}
	
	
	
		}
