package com.cap.hbms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions 
{
	//fields for transactionID and amount of transaction
	@Id
	public int transaction_id;
	public double amount;
	
	//default and parameterized constructors
	
	public Transactions() {
		super();
	}
	
	public Transactions(int transaction_id, double amount) {
		super();
		this.transaction_id = transaction_id;
		this.amount = amount;
	}
	
	
	//getters and setters for fields
	
	public int getTransaction_id() {
		return transaction_id;
	}
	
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transactions [transaction_id=" + transaction_id + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
}
