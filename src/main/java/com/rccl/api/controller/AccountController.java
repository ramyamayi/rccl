package com.rccl.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	private AccountService accountservice;

	@GetMapping
	public List<Account> getAll() throws AppException {
		return accountservice.findAllaccounts();
	}

	/*@GetMapping("/find")
	public Account getAccountByName(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "phone", required = false) String phone) throws AppException {
		if (name != null && !"".equalsIgnoreCase(name.trim())) {
			return accountservice.findByAccountName(name);
		} else if (phone != null && !"".equalsIgnoreCase(phone.trim())) {
			return accountservice.findByAccountPhone(phone);
		} else {
			AppException e = new AppException("name or Phone is required");
			e.setHttpStatus(HttpStatus.BAD_REQUEST);
			throw e;
		}

	}

	@PostMapping("/accounts")
	public Account addAccount(@RequestBody Account account) throws AppException {
		return accountservice.addAccount(account);
	}*/
	
}
