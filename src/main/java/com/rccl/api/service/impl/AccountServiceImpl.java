package com.rccl.api.service.impl;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rccl.api.entity.Account;
import com.rccl.api.entity.account.ContactInformation;
import com.rccl.api.entity.account.PersonalInformation;
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
		Account updateAccount = accountRepository.findById(accountUId)
				.orElseThrow(() -> new Exception("Resource not found"));
		return accountRepository.save(updateAccount);
	}

	@Override
	public List<Account> getAccountsBySearchText(String searchText) {
		List<Account> allAccountList = this.findAllaccounts();
		return allAccountList.stream().filter(accountSearchPredicate(searchText)).collect(Collectors.toList());
	}

	/****************** Util Methods *********************/
	private Predicate<Account> accountSearchPredicate(String searchText) {
		return acct -> containsId(acct, searchText) || checkContactInfo(acct, searchText) || (checkPersonalInfo(acct, searchText));
	}

	private boolean containsId(Account account, String searchText) {
		return account.getAccountId().toUpperCase().contains(searchText.toUpperCase());
	}

	private boolean checkContactInfo(Account account, String searchText) {
		ContactInformation contactInfo = account.getContactInformation();
		if (contactInfo.getEmail() != null && contactInfo.getEmail().toUpperCase().contains(searchText.toUpperCase())) {
			return true;
		}
		if (contactInfo.getMobileNumber() != null
				&& contactInfo.getMobileNumber().toUpperCase().contains(searchText.toUpperCase())) {
			return true;
		}
		if (contactInfo.getPhoneNumber() != null
				&& contactInfo.getPhoneNumber().toUpperCase().contains(searchText.toUpperCase())) {
			return true;
		}
		return false;
	}

	private boolean checkPersonalInfo(Account account, String searchText) {
		PersonalInformation personalInfo = account.getPersonalInformation();
		if (personalInfo != null && personalInfo.getFirstName() != null
				&& personalInfo.getFirstName().toUpperCase().contains(searchText.toUpperCase())) {
			return true;
		}
		if (personalInfo != null && personalInfo.getLastName() != null
				&& personalInfo.getLastName().toUpperCase().contains(searchText.toUpperCase())) {
			return true;
		}
		if (personalInfo != null && personalInfo.getMiddleName() != null
				&& personalInfo.getMiddleName().toUpperCase().contains(searchText.toUpperCase())) {
			return true;
		}
		return false;
	}

}