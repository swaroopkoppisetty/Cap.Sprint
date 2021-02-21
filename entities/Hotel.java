package com.cap.hbms.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int hotel_id;
	String city;
	String hotel_name;
	String address;
	String descripton;
	double average_rate_per_day;
	String email;
	String phone1;
	String phone2;
	String website;
	
	
	public Hotel() {
		
	}


	public Hotel( String hotel_name, String descripton, String address, String city, String phone1, String phone2, 
			String email, String website, double average_rate_per_day) {
		super();
		this.city = city;
		this.hotel_name = hotel_name;
		this.address = address;
		this.descripton = descripton;
		this.average_rate_per_day = average_rate_per_day;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.website = website;
	}
	
	


	public int getHotel_id() {
		return hotel_id;
	}


	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getHotel_name() {
		return hotel_name;
	}


	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDescripton() {
		return descripton;
	}


	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}


	public double getAverage_rate_per_day() {
		return average_rate_per_day;
	}


	public void setAverage_rate_per_day(double average_rate_per_day) {
		this.average_rate_per_day = average_rate_per_day;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone1() {
		return phone1;
	}


	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}


	public String getPhone2() {
		return phone2;
	}


	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	@Override
	public String toString() {
		return "Hotel [hotel_id=" + hotel_id + ", city=" + city + ", hotel_name=" + hotel_name + ", address=" + address
				+ ", descripton=" + descripton + ", average_rate_per_day=" + average_rate_per_day + ", email=" + email
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", website=" + website + "]";
	}
	
	
	
	

}
