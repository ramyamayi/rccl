package com.rccl.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.Account;
import com.rccl.api.entity.Bookings;
import com.rccl.api.respository.AccountRepository;
import com.rccl.api.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired(required = true)
	private AccountRepository accountRepository;

	public List<Account> findAllaccounts() {
		return accountRepository.findAll();
	}

	@Override
	public Account getAccountByAccountUid(String accountUId) {
		return accountRepository.findByUid(accountUId).orElse(null);
	}

	@Override
	public String getAccountContactNameByAccountUid(String accountUId) {
		Account account = accountRepository.findByUid(accountUId).orElse(null);
		return account.getPersonalInformation().getFirstName() + " " + account.getPersonalInformation().getLastName();
	}

	@Override
	public Account addAccount(Account account) {

		return accountRepository.save(account);
	}

	@Override
	public String deleteAccount(String accountUId) {
		accountRepository.deleteById(accountUId);
		return "Account deleted";
	}

	@Override
	public Account updateAccount(String accountUId, Account account) throws Exception {
		Account updateAccount = accountRepository.findById(accountUId).orElseThrow(() -> new Exception("Resource not found"));
		return accountRepository.save(updateAccount);
	}
 

	/*
	 * 
	 * public Account findByAccountPhone(String name) { Optional<Account> account =
	 * accountRepository.findByPhone(name); return account.orElse(null); }
	 */

}