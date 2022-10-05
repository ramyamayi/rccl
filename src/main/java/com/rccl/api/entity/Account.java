package com.rccl.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import com.rccl.api.entity.account.ContactInformation;
import com.rccl.api.entity.account.LoyaltyInformation;
import com.rccl.api.entity.account.PersonalInformation;

import lombok.Data;

@Document
@Data
public class Account {
	@Id
	private String accountId;

	private String consumerId;
	private ContactInformation contactInformation;
	private LoyaltyInformation loyaltyInformation;
	private PersonalInformation personalInformation;
	private String uid;
	private String uidType;

	public void setConsumerId(String consumerId) {

		this.consumerId = consumerId;

	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public LoyaltyInformation getLoyaltyInformation() {
		return loyaltyInformation;
	}

	public void setLoyaltyInformation(LoyaltyInformation loyaltyInformation) {
		this.loyaltyInformation = loyaltyInformation;
	}

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		if(contactInformation.getEmail().equals(uid)) {
		this.uid = contactInformation.getEmail();
		}
		else if(contactInformation.getPhoneNumber().equals(uid)) {
			this.uid = contactInformation.getPhoneNumber();
		}
	}

	public String getUidType() {
		if((this.uid).equals(contactInformation.getEmail())) {
		return "EMAIL";
		}
	
		else if((this.uid).equals(contactInformation.getPhoneNumber())) {
			return "PHONE";
		}
		else {
			return null;
		}
	}

	public void setUidType(String uidType) {
		this.uidType = uidType;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public Account(String accountId, String consumerId, ContactInformation contactInformation,
			LoyaltyInformation loyaltyInformation, PersonalInformation personalInformation, String uid,
			String uidType) {
		super();
		this.accountId = accountId;
		this.consumerId = consumerId;
		this.contactInformation = contactInformation;
		this.loyaltyInformation = loyaltyInformation;
		this.personalInformation = personalInformation;
		this.uid = uid;
		this.uidType = uidType;
	}

}
