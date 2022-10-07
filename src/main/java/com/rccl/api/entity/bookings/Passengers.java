package com.rccl.api.entity.bookings;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Data
public class Passengers {

	private String lastName;
	private String firstName;
	private String title;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date birthdate;
	private String email;
	private String consumerId;
	private String passengerId;
	private String passengerStatus;
	
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getFirstName() {
		return this.firstName ;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getBirthdate() {
		return this.birthdate;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getConsumerId() {
		return this.consumerId ;
	}

	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerStatus() {
		return passengerStatus;
	}
	public void setPassengerStatus(String passengerStatus) {
		this.passengerStatus = passengerStatus;
	}

	public Passengers(String lastName, String firstName, String title, Date birthdate, String email, String consumerId,
			String passengerId, String passengerStatus) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.title = title;
		this.birthdate = birthdate;
		this.email = email;
		this.consumerId = consumerId;
		this.passengerId = passengerId;
		this.passengerStatus = passengerStatus;
	}
	
}
