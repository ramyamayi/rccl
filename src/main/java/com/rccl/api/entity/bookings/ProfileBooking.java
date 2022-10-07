package com.rccl.api.entity.bookings;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ProfileBooking {

private String bookingId;
private String masterBookingId;
private String brand;
private String stateroomType;
private String stateroomNumber;
private String stateroomDescription;
private Passengers passengers ;

public String getBookingId() {
	return bookingId;
}
public void setBookingId(String bookingId) {
	this.bookingId = bookingId;
}
public String getMasterBookingId() {
	return masterBookingId;
}
public void setMasterBookingId(String masterBookingId) {
	this.masterBookingId = masterBookingId;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getStateroomType() {
	return stateroomType;
}
public void setStateroomType(String stateroomType) {
	this.stateroomType = stateroomType;
}
public String getStateroomNumber() {
	return stateroomNumber;
}
public void setStateroomNumber(String stateroomNumber) {
	this.stateroomNumber = stateroomNumber;
}
public String getStateroomDescription() {
	return stateroomDescription;
}
public void setStateroomDescription(String stateroomDescription) {
	this.stateroomDescription = stateroomDescription;
}
public Passengers getPassengers() {
	return passengers;
}
public void setPassengers(Passengers passengers) {
	this.passengers = passengers;
}
public ProfileBooking(String bookingId, String masterBookingId, String brand, String stateroomType,
		String stateroomNumber, String stateroomDescription, Passengers passengers) {
	super();
	this.bookingId = bookingId;
	this.masterBookingId = masterBookingId;
	this.brand = brand;
	this.stateroomType = stateroomType;
	this.stateroomNumber = stateroomNumber;
	this.stateroomDescription = stateroomDescription;
	this.passengers = passengers;
}

public ProfileBooking() {
}


	
}
