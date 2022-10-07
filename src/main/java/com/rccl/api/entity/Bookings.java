package com.rccl.api.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import com.rccl.api.entity.bookings.ProfileBooking;

import lombok.Data;

@Data
@Document

public class Bookings {
	@Id
	private String bookingId;
	private String accountId;	
	private ProfileBooking profileBooking;
	private String consumerId;
	private String passengerId;
	private String masterPassengerId;
	private String lastName;
	
	
	public String getBookingId() {
		return bookingId;
	}
	public String getAccountId() {
		return accountId;
	}
	
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	
	public ProfileBooking getProfileBooking() {
		return profileBooking;
	}
	public void setProfileBooking(ProfileBooking profileBooking) {
		this.profileBooking = profileBooking;
	}
	public String getConsumerId() {
		return consumerId = profileBooking.getPassengers().getConsumerId();
	}
	
	public String getPassengerId() {
		return passengerId  =profileBooking.getPassengers().getPassengerId();
	}
	
	public String getMasterPassengerId() {
		return masterPassengerId;
	}
	public void setMasterPassengerId(String masterPassengerId) {
		this.masterPassengerId = masterPassengerId;
	}
	public String getLastName() {
		return lastName = profileBooking.getPassengers().getLastName();
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
