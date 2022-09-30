package com.rccl.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.rccl.api.entity.Account;
import com.rccl.api.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AccountController {

	@Autowired
	private AccountService accountservice;

	@GetMapping("/accounts")
	public List<Account> getAll() throws Exception {
		return accountservice.findAllaccounts();
	}
	 @GetMapping("/accounts/{name}")
	public Account getByAccountName(@PathVariable ("name") String name ) {
		return accountservice.findByAccountName(name);
	}
	/*
	@GetMapping("/accounts/{name}/{phone}")
	public Account getByAccountName(@PathVariable ("name") String name ,@PathVariable ("phone") String phone) {
		return accountservice.findByAccountNameOrPhone(name, phone);
	}
	
	*/
	@PostMapping("/accounts")
	public Account addAccount(@RequestBody Account account) {
		return accountservice.addAccount(account);
	}
}
