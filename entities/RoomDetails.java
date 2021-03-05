package com.cap.hbms.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int room_id;
	int hotel_id;
	String roomNo;
	String roomType;
	double rate_per_day;
	boolean isavailable;
	
	
	
	

	public RoomDetails(int room_id, int hotel_id, String roomNo, String roomType, double rate_per_day,
			boolean isavailable) {
		super();
		this.room_id = room_id;
		this.hotel_id = hotel_id;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.rate_per_day = rate_per_day;
		this.isavailable = isavailable;
	}
	

	public int getRoom_id() {
		return room_id;
	}


	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}


	public int getHotel_id() {
		return hotel_id;
	}


	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}


	public String getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public double getRate_per_day() {
		return rate_per_day;
	}


	public void setRate_per_day(double rate_per_day) {
		this.rate_per_day = rate_per_day;
	}


	public boolean isIsavailable() {
		return isavailable;
	}


	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}


	@Override
	public String toString() {
		return "RoomDetails [room_id=" + room_id + ", hotel_id=" + hotel_id + ", roomNo=" + roomNo + ", roomType="
				+ roomType + ", rate_per_day=" + rate_per_day + ", isavailable=" + isavailable + "]";
	}
	
}
	