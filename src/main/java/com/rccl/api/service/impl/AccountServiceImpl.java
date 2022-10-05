package com.rccl.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.Account;
import com.rccl.api.respository.AccountRepository;
import com.rccl.api.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;

	public List<Account> findAllaccounts() {
		return accountRepository.findAll();
	}

	/*
	 * public Account addAccount(Account account) { return
	 * accountRepository.save(account); }
	 * 
	 * public Account findByAccountName(String name) { Optional<Account> account =
	 * accountRepository.findByNameIgnoreCase(name); return account.orElse(null); }
	 * 
	 * public Account findByAccountPhone(String name) { Optional<Account> account =
	 * accountRepository.findByPhone(name); return account.orElse(null); }
	 */
}