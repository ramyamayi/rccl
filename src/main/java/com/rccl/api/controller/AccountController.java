package com.rccl.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.rccl.api.entity.Account;
import com.rccl.api.exception.AppException;
import com.rccl.api.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping
	public List<Account> getAll() throws AppException {
		return accountService.findAllaccounts();
	}

	@GetMapping("/{accountUId}/getAccountName")
	public String getAccountNameByAccountUId(@PathVariable("accountUId") String accountUId) {
		return accountService.getAccountContactNameByAccountUid(accountUId);
	}

	@GetMapping("/{accountUId}")
	public Account getAccountByAccountUId(@PathVariable("accountUId") String accountUId) {
		return accountService.getAccountByAccountUid(accountUId);
	}

	@PostMapping
	public Account addNewAccount(@RequestBody Account account){
		return accountService.addAccount(account);
	}

}
