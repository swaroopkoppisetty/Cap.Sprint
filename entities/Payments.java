package com.cap.hbms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payments 
{
	//fields as per payments(payment_id,booking_id,transaction_id)
	@Id
	public int payment_id;
	public int booking_id;
	public int transaction_id;
	
	
	//default and parameterized constructors
	public Payments() {
		super();
	}

	public Payments(int payment_id, int booking_id, int transaction_id) {
		super();
		this.payment_id = payment_id;
		this.booking_id = booking_id;
		this.transaction_id = transaction_id;
	}

	
	
	//getters and setters for fields
	
	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	@Override
	public String toString() {
		return "Payments [payment_id=" + payment_id + ", booking_id=" + booking_id + ", transaction_id="
				+ transaction_id + "]";
	}
	
	
	
	
	
	
}
