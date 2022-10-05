package com.rccl.api.entity.account;

import lombok.Data;

@Data
public class ContactInformation {

	private String email;
	private String mobileNumber;
    private String phoneNumber;

	public ContactInformation() {

	}

	public ContactInformation(String email, String mobileNumber, String phoneNumber) {
		super();
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
