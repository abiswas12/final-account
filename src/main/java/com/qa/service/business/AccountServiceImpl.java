package com.qa.service.business;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.service.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	private static final Logger LOGGER = Logger.getLogger(AccountService.class);

	@Inject
	private AccountRepository repo;

	public String getAllAccounts() {
		LOGGER.info("In AccountServiceImpl getAllAccounts ");
		return repo.getAllAccounts();
	}

	@Override
	public String addAccount(String account) {
		LOGGER.info("In AccountServiceImpl addAccounts ");
		return repo.createAccount(account);
	}

	@Override
	public String updateAccount(Long id, String account) {
		LOGGER.info("In AccountServiceImpl getAllAccounts ");
		return repo.updateAccount(id, account);
	}

	@Override
	public String deleteAccount(Long id) {
		LOGGER.info("In AccountServiceImpl deleteAccounts ");
		return repo.deleteAccount(id);

	}

	public void setRepo(AccountRepository repo) {
		LOGGER.info("In AccountServiceImpl setRepo ");
		this.repo = repo;
	}
}
