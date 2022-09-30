package com.rccl.api.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import com.couchbase.client.core.deps.com.fasterxml.jackson.annotation.JsonFormat;


@Document
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationStrategy.USE_ATTRIBUTES)
	private Long accountId;
	private String name;
	private String loyalty;
	private String email;
	private String phone;
	private String groupId;
	private int room;
	@JsonFormat(pattern="yyyy-MM-dd")
	private String bday;
	
	

	public Long getAccountId() {
		return accountId;
	}

	public void setLoyalty(String loyalty) {
		this.loyalty = loyalty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoyalty() {
		return loyalty;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public  String getBday() {
		return bday;
	}
	public void setRoom(String bday) {
		this.bday = bday;
	}

	

	public Account(Long accountId, String name, String loyalty, String email, String phone, String groupId, int room,
			String bday) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.loyalty = loyalty;
		this.email = email;
		this.phone = phone;
		this.groupId = groupId;
		this.room = room;
		this.bday = bday;
	}

	public Account() {

	}

}
