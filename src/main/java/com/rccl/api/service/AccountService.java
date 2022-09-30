package com.rccl.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rccl.api.entity.Account;
import com.rccl.api.respository.AccountRepository;

@Service
public class AccountService {
@Autowired
private AccountRepository accountRepository;


	public List<Account> findAllaccounts() {
		
		return accountRepository.findAll();
	}

	
	public Account addAccount(Account account) {
		return accountRepository.save(account);
	}
	

	public Account findByAccountName(String name) {
		Optional<Account> account = accountRepository.findByNameIgnoreCase(name);	
		return account.orElse(null);
	}


	
	
}