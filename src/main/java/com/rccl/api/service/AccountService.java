package com.rccl.api.service;

import java.util.List;

import com.rccl.api.entity.Account;
import com.rccl.api.entity.Bookings;

public interface AccountService {
	public List<Account> findAllaccounts();

	public Account getAccountByAccountUid(String accountUId);
	
	public String getAccountContactNameByAccountUid(String accountUId);


	public Account addAccount(Account account);
}