package com.rccl.api.service;

import java.util.List;

import com.rccl.api.entity.Account;

public interface AccountService {
	public List<Account> findAllaccounts();

	public Account getAccountByAccountUid(String accountUId);

	public String getAccountContactNameByAccountUid(String accountUId);

	public Account addAccount(Account account);

	public String deleteAccount(String accountUId);

	public Account updateAccount(String accountUId, Account account) throws Exception;

	public List<Account> getAccountsBySearchText(String searchText);

}